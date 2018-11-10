/*
 * purpose:binary conversion 
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;

public class Bin {
	/**
	 * 
	 * @param num decimal number into convert binary
	 */
static String toBinary(int num)
{
	
	int a=num;
	//to concantenate the values
	String n="";
	/*
	 * 
	 * using while loop
	 * iterate upto num!=0
	 * 
	 */
	while(num!=0)
	{
		int dec=num%2;
		n=dec+n;
		num=num/2;
	}
	//to primt the binary value for decimal number
	System.out.println("the binary value of "+a+" is ("+n+")2");
	/*
	 * function call
	 * to print the nibble values for given binary 
	 * 
	 */
    
	
	return n;  
	
}
static void padding(String n)
{
	for (int i = n.length(); i < 32; i++) {
		n="0"+n;
	}
	System.out.println("the binary value represent in 4 byte string is:");
	System.out.println(n);
}
/**
 * 
 * @param n binary value in string 
 */
static void nibbles(String n)
{
	
	String nibble="";
	for (int i = n.length(); i < 8; i++) {
		n="0"+n;
	}
	char c[]=n.toCharArray();
	// mid value to swap the binary value for nibble calculation 
	int mid=c.length/2;
	for(int i=mid;i<c.length;i++)
	{
		nibble=nibble+c[i];
	}
	for(int i=0;i<mid;i++)
	{
		nibble=nibble+c[i];
	}
	System.out.println("the nibble value is "+nibble);
	char ch[]=nibble.toCharArray();
	// to convert string into integer 

	//to count the digits of number
	int count=nibble.length(),j=0,sum=0,i=nibble.length()-1;int num;
	while(count!=0)
	{
		if(ch[i]==0)
			num=(int)ch[i]-47;
		else
			num=(int)ch[i]-48;
		j++;
		int dec=1;
		/*
		 * if loop for only rem=1 
		 * j used as power 
		 */
		if(num==1)
		{
			for(int k=0;k<j-1;k++)
			{
				dec=dec*2;
				
			}
			// sum to calculate the value
			sum=sum+dec;
			
		}
		i--;
		count--;
	}
	// to print the results
	System.out.println(sum);
}
}
