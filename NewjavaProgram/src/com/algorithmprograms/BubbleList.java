/*
 * purpose:Bubble Sort to sort the words in the integer array
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;/*
 * we use list interface to store the list of words
 * 
 */ 
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleList {
	/*
	 * This is main function
	 * to sort array
	 * 
	 */

	public static void main(String[] args) {
		//arraylist its contains list to store list of words
		ArrayList<Integer> l=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=s.nextInt();
		int arr[]=new int[n];
		/*
		 * using for loop 
		 * initializing i=0
		 * i iterate upto n
		 *  
		 */
		for(int i=0;i<n;i++)
		{
			//enter the string to add in list
			System.out.println("enter the number");
			int a=s.nextInt();
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
		System.out.println("Integer array");
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
		int a[]=Bubble.sorting(arr);
		System.out.println("after Bubble sort");
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
