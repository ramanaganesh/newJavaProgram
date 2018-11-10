/*
 * purpose:insertion sort for integer and string
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/

package com.algorithmprograms;
public class InsertionSort {
	/*
	 * This is main function
	 * Insertion sort call for integer and string
	 * 
	 */
public static void main(String[] args) {
	/*
	 * two array declaration
	 * arr[] its for integer check
	 * word[] its for string check
	 * 
	 */
	int a[]= {4,1,3,6,2,5,0};
	String word[]= {"mango","banana","grape","guava","apple"};
	/*
	 * 
	 * function call
	 * to sort the elements 
	 * here stop watch is used to calculate the method call difference
	 * 
	 */
	long start=System.currentTimeMillis();
	/*
	 * 
	 * b[] to store the sorted array after function call
	 */
	int b[]=Insertion.sorting(a);
	//to print the result for integer
	System.out.print("[");
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+" ");
	}
	System.out.print("]");
	long finish=System.currentTimeMillis();
	long elapsedTime=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime);
	System.out.println();
	start=System.currentTimeMillis();
	/*
	 * 
	 * w[] to store the sorted array after function call
	 */

	String w[]=Insertion.sorting(word);
	
	//to print the result for String
	System.out.print("[");
	for(int i=0;i<w.length;i++)
	{
		System.out.print(w[i]+" ");
	}
	System.out.print("]");
	finish=System.currentTimeMillis();
	elapsedTime=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime);
}
}
