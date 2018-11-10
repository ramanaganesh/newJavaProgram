/*
 * purpose:Merge sort 
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;

public class MergeSort {
	/*
	 * This is main function
	 * to call merge and sort 
	 * print result 
	 * 
	 */
public static void main(String[] args) {
	
	String word[]= {"mango","guava","tomato","grape","apple"};
	/*
	 * function call
	 * to sort the string
	 * return sorted string
	 * 
	 */
	String w[]=Sort.sort(word, 0, word.length-1);
	System.out.print("[");
	//print the results
	for (int i = 0; i < w.length; i++) {
		System.out.print(w[i]+" ");
	}
	System.out.print("]");
}
}
