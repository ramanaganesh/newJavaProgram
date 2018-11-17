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

import com.utility.Utility;

public class InsertionList {
	/*
	 * This is main function
	 * to sort array 
	 * 
	 */
public static void main(String[] args) {
	//arraylist its contains list to store list of words
	ArrayList<String> arrayList=new ArrayList<>();
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the limit");
	int limit=scanner.nextInt();
	String word[]=new String[limit];
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto n
	 *  
	 */
	for(int i=0;i<limit;i++)
	{
		//enter the string to add in list
		System.out.println("enter the string");
		String string=scanner.next();
		arrayList.add(string);
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
		word[i]=arrayList.get(i);
		
	}
	System.out.println("string array");
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto n
	 *  
	 */
	for(int i=0;i<limit;i++)
	{
		//before sorted
		System.out.println(word[i]);
	}
	String resultWord[]=Utility.sorting(word);
	System.out.println("after insertion sort");
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto n
	 *  
	 */
	for(int i=0;i<limit;i++)
	{
		//after sorted
		System.out.println(resultWord[i]);
	}
	scanner.close();
}
}
