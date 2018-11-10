/*
 * purpose:insertion sort for integer and string
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;
public class Insertion {
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
	 * initializing i=1
	 * i iterate upto arr.length
	 *  
	 */
	
	for(int i=1;i<arr.length;i++)
	{
		int key=arr[i];
		int j=i-1;
		/*
		 * 
		 * using while loop
		 * we have to check j upto 0
		 * 
		 * 
		 */
		while(j>=0 && arr[j]>key)
		{
			//if the key value is less than arr[j] means store the value in arr[j+1]j
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
	}
	return arr;
}
/**
 * 
 * @param arr its an string array
 * @return sorted array
 */
static String[] sorting(String arr[])
{
	//System.out.println("String");
	/*
	 * using for loop 
	 * initializing i=1
	 * i iterate upto arr.length
	 *  
	 */
	
	for(int i=1;i<arr.length;i++)
	{
		String key=arr[i];
		int j=i-1;
		/*
		 * 
		 * using while loop
		 * we have to check j upto 0
		 * 
		 */
		while(j>=0 && arr[j].compareTo(key)>0)
		{
			//if the key value is less than arr[j] means store the value in arr[j+1]j
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
	}
	return arr;
}
}
