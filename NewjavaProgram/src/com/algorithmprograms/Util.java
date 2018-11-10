/*
 * purpose:check whether two string anagram or not
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/

package com.algorithmprograms;

public class Util {
	/**
	 * 
	 * @param st1 to store the string to check anagram
	 * @param st2 to store the string to check anagram
	 * @return no
	 */
static boolean isAnagram(String st1,String st2)
{
	/*
	 * function call to check the two string anagram or not
	 * 
	 * 
	 */
	boolean b=check(st1,st2);
	/*
	 * 
	 * if:true print ana=gram
	 * else: print not anagram
	 * 
	 */
	if(b)
		System.out.println("is anagram");
	else
		System.out.println("is not anagram");
	return true;
}

/**
 * 
 * @param st2  taking input string from calling function
 * @param st1 taking input string from calling function
 * @return true or false
 */
private static boolean check(String st2,String st1)
	{
	/*
	 * 
	 * initializing two integer array
	 * to store the inputs for corresponding alphabet letter
	 * 
	 */
		int c[]=new int[26];
		int c1[]=new int[26];
		
		//its used to convert string into character array
		char ch[]=st2.toCharArray();
		char ch1[]=st1.toCharArray();
		/*
		 * using for loop 
		 * initializing i=0
		 * i iterate upto last letter(ch.length)
		 *  
		 */
		
		for (int i = 0; i < ch.length; i++) 
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					//to store the inputs for corresponding alphabet letter
					c[ch[i]-97]++;
					
				}
			}
		/*
		 * using for loop 
		 * initializing i=0
		 * i iterate upto last letter(ch.length)
		 *  
		 */
		for (int i = 0; i < ch1.length; i++) 
		{
			if(ch1[i]>='a' && ch1[i]<='z')
			{
				
				//to store the inputs for corresponding alphabet letter
				c1[ch1[i]-97]++;
			}
		}
		/*
		 * using for loop 
		 * initializing i=0
		 * i iterate upto 26
		 *  
		 */
	     	for(int i=0;i<26;i++)
	     	{
	     		/*
	     		 * 
	     		 * if:check whether its same or not if its differ means its return false
	     		 */
	     		if(c[i]!=c1[i])
	     				return false;
	     		
	     	}
	     	return true;
	     	
	}
}

