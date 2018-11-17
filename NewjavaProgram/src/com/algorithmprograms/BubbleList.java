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

import com.utility.Utility;

public class BubbleList {
	/*
	 * This is main function
	 * to sort array
	 * 
	 */

	public static void main(String[] args) {
		//arraylist its contains list to store list of words
		ArrayList<Integer> arrayList=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=scanner.nextInt();
		int number[]=new int[limit];
		/*
		 * using for loop 
		 * initializing i=0
		 * i iterate upto n
		 *  
		 */
		for(int i=0;i<limit;i++)
		{
			//enter the string to add in list
			System.out.println("enter the number");
			int inputNumber=scanner.nextInt();
			arrayList.add(inputNumber);
		}
		System.out.println(arrayList);
		/*
		 * using for loop 
		 * initializing i=0
		 * i iterate upto n
		 *  
		 */
		for(int i=0;i<limit;i++)
		{
			//to get an words and stored in array
			number[i]=arrayList.get(i);
			
		}
		System.out.println("Integer array");
		/*
		 * using for loop 
		 * initializing i=0
		 * i iterate upto n
		 *  
		 */
		for(int i=0;i<limit;i++)
		{
			//before sorted
			System.out.println(number[i]);
		}
		int finalSort[]=Utility.sorting(number);
		System.out.println("after Bubble sort");
		/*
		 * using for loop 
		 * initializing i=0
		 * i iterate upto n
		 *  
		 */
		for(int i=0;i<limit;i++)
		{
			//after sorted
			System.out.println(finalSort[i]);
		}
		scanner.close();
	}

}
