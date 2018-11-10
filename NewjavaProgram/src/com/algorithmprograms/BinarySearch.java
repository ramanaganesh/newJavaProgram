/*
 * purpose:binary search for integer and string
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/

package com.algorithmprograms;

import java.util.Scanner;

public class BinarySearch {
	/*
	 * This is main function
	 * binary search call for integer and string
	 * 
	 */
public static void main(String[] args) {
	/*
	 * two array declaration
	 * arr[] its for integer check
	 * a[] its for string check
	 * 
	 */
	int arr[]= {0,1,2,3,4,5,6,7};
	String a[]= {"aman","banana","grape","guava","mango"};
	//inputs for the key
	System.out.println("enter the key for integer and String");
	Scanner s=new Scanner(System.in);
	int key=s.nextInt();
	String word=s.next();
	/*
	 * 
	 * function call
	 * to check the search element in the array or not
	 * here stop watch is used to calculate the method call difference
	 * 
	 */
	long start=System.currentTimeMillis();
	Binary.binarySearch(arr, key);
	long finish=System.currentTimeMillis();
	long elapsedTime=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime);
	start=System.currentTimeMillis();
	Binary.binarySearch(a, word);
	finish=System.currentTimeMillis();
	elapsedTime=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime);
	s.close();
}
}
