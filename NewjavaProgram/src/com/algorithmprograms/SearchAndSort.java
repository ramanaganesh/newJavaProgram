package com.algorithmprograms;

import java.util.Scanner;
import com.utility.*;
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
	int number[]= {1,2,4,6,7,8,9,12};
	String word[]= {"aman","banana","grape","guava","mango"};
	//inputs for the key
	System.out.println("enter the key for integer and String");
	Scanner s=new Scanner(System.in);
	int key=s.nextInt();
	String string=s.next();
	/*
	 * 
	 * function call
	 * to check the search element in the array or not
	 * here stop watch is used to calculate the method call difference
	 * 
	 */
	long start=System.nanoTime();
	Utility.binarySearch(number, key);
	long finish=System.nanoTime();
	elapsedTime[j]=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime[j]);
	j++;
	
	start=System.nanoTime();
	Utility.binarySearch(word, string);
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
	int sort[]=Utility.sorting(number);
	//to print the result for integer
	System.out.print("[");
	for(int i=0;i<sort.length;i++)
	{
		System.out.print(sort[i]+" ");
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

	String sortedWord[]=Utility.sorting(word);
	
	//to print the result for String
	System.out.print("[");
	for(int i=0;i<sortedWord.length;i++)
	{
		System.out.print(sortedWord[i]+" ");
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
	int sortedNumber[]=Utility.sort(number);
	//to print the result for integer
	System.out.print("[");
	for(int i=0;i<sortedNumber.length;i++)
	{
		System.out.print(sortedNumber[i]+" ");
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

	String wordSorted[]=Utility.sort(word);
	
	//to print the result for String
	System.out.print("[");
	for(int i=0;i<wordSorted.length;i++)
	{
		System.out.print(wordSorted[i]+" ");
	}
	System.out.println("]");
	finish=System.nanoTime();
	elapsedTime[j]=finish-start;
	System.out.println(start+"--"+finish+"--"+elapsedTime[j]);

	
	s.close();
}
}

