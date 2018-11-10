/*
 * purpose:binary search for integer and string
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/

package com.algorithmprograms;

import java.util.Scanner;

public class Binary {
	/**
	 * 
	 * @param a its an integer array
	 * @param key its a search key
	 * 
	 */
	
static void binarySearch(int a[],int key)
{
	//System.out.println("Integer");
	
int low=0,flag=0;
int high=a.length-1;
/*
 * 
 * using while loop
 * we have to iterate upto low <=high
 * 
 */
while(low<=high)
{
	//for binary search we have to find mid value for current low and high
	int mid=(low+high)/2;
	/*
	 * 
	 * if: we have to check whether the key value is left side
	 * else if: we have to check whether the key value is right side
	 * else if: its in mid position we have to print the key
	 */
	System.out.println(low+" "+mid+" "+high);
	if(a[mid]>key)
	{
		System.out.println(mid);
		high=mid-1;
		//System.out.println(low+" "+high);
	}
	else if(a[mid]<key)
	{
		System.out.println(mid);
		low=mid+1;
	}
	else if(a[mid]==key)
	{
		System.out.println(low+" "+mid+" "+high);
		//flag is used to check the key is found or not 
		flag=1;
		//print the result with position
		System.out.println("the key is found "+key+ " in "+mid+" position");
		break;
	}
}
if(flag==0)
	System.out.println("the key is not in the array");
}

static void binarySearch(String a[],String key)
{
	//System.out.println("String");
	int low=0;byte flag=0;
	int high=a.length-1;
	/*
	 * 
	 * using while loop
	 * we have to iterate upto low <=high
	 * 
	 */
	while(low<=high)
	{
		//for binary search we have to find mid value for current low and high
		int mid=(low+high)/2;
		/*
		 * 
		 * if: we have to check whether the key value is left side
		 * else if: we have to check whether the key value is right side
		 * else if: its in mid position we have to print the key
		 */
		if(a[mid].compareTo(key)>0)
		{
			
			high=mid-1;
		}
		else if(a[mid].compareTo(key)<0)
		{
			
			low=mid+1;
		}
		else if(a[mid].compareTo(key)==0)
		{
			
			//flag is used to check the key is found or not 
			flag=1;
			//print the result with position
			System.out.println("the key is found "+key+ " in "+mid+" position");
			break;
		}
		
	}
	System.out.println(flag);
	if(flag==0)
		System.out.println("the key is not in the array");
	}
static void binarySearch1(int a[])
{
	//System.out.println("Integer");
Scanner s=new Scanner(System.in);	
int low=0,flag=0;
int high=a.length-1;
String b="false";
/*
 * 
 * using while loop
 * we have to iterate upto low <=high
 * 
 */
int ch=0;
do
{
	
while(low<=high)
{
	//for binary search we have to find mid value for current low and high
	int mid=(low+high)/2;
	if(b!="true")
	{
		System.out.println("if ur guess number is "+a[mid]);
		System.out.println("true or false");
		b=s.next();
		
		if(b.equals("true"))
		{
			System.out.println("the key is found " +a[mid]);
			flag=1;
			break;
		}
	}
	if(high!=mid && mid!=low && b.equals("false"))
	{
	System.out.println("ur guess number is \n1.less than "+a[mid]+" \n2.greater than "+a[mid]);
	 ch=s.nextInt();
	}
	/*
	 * 
	 * if: we have to check whether the key value is left side
	 * else if: we have to check whether the key value is right side
	 * else if: its in mid position we have to print the key
	 */
	System.out.println(low+" "+mid+" "+high);
	if(ch==1 && high!=mid && mid!=low && b!="true")
	{
	
		high=mid-1;
		
		
	}
	else if(ch==2 && high!=mid && mid!=low && b!="true")
	{

		
		low=mid+1;
		
	}
	
	else if(low==high)
	{
		//flag is used to check the key is found or not 
		flag=1;
		//print the result with position
		System.out.println("the key is found " +a[low]);
		b="true";
		break;
	}
}

}while(b=="false");
if(flag==0)
	System.out.println("the key is not in the array");
s.close();
}

}
