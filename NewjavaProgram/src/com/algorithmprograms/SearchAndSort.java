package com.algorithmprograms;

import java.util.Scanner;

public class SearchAndSort {
public static void main(String[] args) {
	/*
	 * two array declaration
	 * arr[] its for integer check
	 * a[] its for string check
	 * 
	 */
	long elapsedTime[]=new long[6];
	int j=0;
	int arr[]= {1,2,4,6,7,8,9,12};
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
	long start=System.nanoTime();
	Binary.binarySearch(arr, key);
	long finish=System.nanoTime();
	elapsedTime[j]=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime[j]);
	j++;
	
	start=System.nanoTime();
	Binary.binarySearch(a, word);
	finish=System.nanoTime();
	elapsedTime[j]=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime[j]);
	j++;
	/*
	 * two array declaration
	 * arr[] its for integer check
	 * word[] its for string check
	 * 
	 */
	System.out.println("insertion sort");
	
	/*
	 * 
	 * function call
	 * to sort the elements 
	 * here stop watch is used to calculate the method call difference
	 * 
	 */
	start=System.nanoTime();
	/*
	 * 
	 * b[] to store the sorted array after function call
	 */
	int b[]=Insertion.sorting(arr);
	//to print the result for integer
	System.out.print("[");
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+" ");
	}
	System.out.println("]");
	
	
	
	finish=System.nanoTime();
	elapsedTime[j]=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime[j]);
	j++;
	System.out.println();
	start=System.nanoTime();
	/*
	 * 
	 * w[] to store the sorted array after function call
	 */

	String w[]=Insertion.sorting(a);
	
	//to print the result for String
	System.out.print("[");
	for(int i=0;i<w.length;i++)
	{
		System.out.print(w[i]+" ");
	}
	System.out.println("]");
	finish=System.nanoTime();
	elapsedTime[j]=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime[j]);
	j++;
	System.out.println("bubble sort");
	/*
	 * 
	 * function call
	 * to sort the elements 
	 * here stop watch is used to calculate the method call difference
	 * 
	 */

	start=System.nanoTime();
	/*
	 * 
	 * b[] to store the sorted array after function call
	 */
	int b1[]=Bubble.sorting(arr);
	//to print the result for integer
	System.out.print("[");
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b1[i]+" ");
	}
	System.out.println("]");
	
	
	
	
	finish=System.nanoTime();
	elapsedTime[j]=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime[j]);
	j++;
	System.out.println();
	start=System.nanoTime();
	/*
	 * 
	 * w[] to store the sorted array after function call
	 */

	String w1[]=Bubble.sorting(a);
	
	//to print the result for String
	System.out.print("[");
	for(int i=0;i<w.length;i++)
	{
		System.out.print(w1[i]+" ");
	}
	System.out.println("]");
	finish=System.nanoTime();
	elapsedTime[j]=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime[j]);

	
	s.close();
}
}

