/*
 * purpose:bubble sort for integer and string
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;
public class Bubble {
	/**
	 * 
	 * @param arr its an integer array
	 * @return sorted array
	 */
static int[] sorting(int arr[])
{
	//System.out.println("Integer");
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto arr.length-1
	 *  
	 */
	for(int i=0;i<arr.length-1;i++)
	{
		/*
		 * using inner for loop 
		 * initializing j=0
		 * j iterate upto arr.length
		 *  
		 */
		for(int j=i;j<arr.length;j++)
		{
			/*
			 * 
			 * if:the next value is greater than swap the values
			 * 
			 */
			if(arr[j]<arr[i])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
}
/**
 * 
 * @param arr its an String array
 * @return sorted array
 */

static String[] sorting(String arr[])
{//System.out.println("string");
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto arr.length-1
	 *  
	 */
	for(int i=0;i<arr.length-1;i++)
	{
		/*
		 * using inner for loop 
		 * initializing j=0
		 * j iterate upto arr.length
		 *  
		 */
		for(int j=i;j<arr.length;j++)
		{
			/*
			 * 
			 * if:the next value is greater than swap the values
			 * 
			 */
			if(arr[j].compareTo(arr[i])<0)
			{
				String temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
}
}
