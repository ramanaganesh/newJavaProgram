/*
 * purpose:Insertion Sort to sort the words in the Strings array
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/

package com.algorithmprograms;
/*
 * we use list interface to store the list of words
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionList {
	/*
	 * This is main function
	 * to sort array 
	 * 
	 */
public static void main(String[] args) {
	//arraylist its contains list to store list of words
	ArrayList<String> l=new ArrayList<>();
	Scanner s=new Scanner(System.in);
	System.out.println("enter the limit");
	int n=s.nextInt();
	String arr[]=new String[n];
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto n
	 *  
	 */
	for(int i=0;i<n;i++)
	{
		//enter the string to add in list
		System.out.println("enter the string");
		String a=s.next();
		l.add(a);
	}
	System.out.println(l);
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto n
	 *  
	 */
	for(int i=0;i<n;i++)
	{
		//to get an words and stored in array
		arr[i]=l.get(i);
		
	}
	System.out.println("string array");
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto n
	 *  
	 */
	for(int i=0;i<n;i++)
	{
		//before sorted
		System.out.println(arr[i]);
	}
	String a[]=Insertion.sorting(arr);
	System.out.println("after insertion sort");
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto n
	 *  
	 */
	for(int i=0;i<n;i++)
	{
		//after sorted
		System.out.println(a[i]);
	}
	s.close();
}
}
