/*
 * purpose:Binary Search the Word from Word List
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;
/*
 * 
 * bufferreader : is used to read the list of words from file
 * 
 */

import java.util.Scanner;

import com.utility.Utility;

public class SearchWordList {

/*
 * This is main function
 * to find Anagram   Detection 
 * 
 */

public static void main(String[] args)
{
try {
	
		//getting an input from the user with the help of scanner
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the search word");
		String word=scanner.next();
	     String words[]=FileRead.StringFile();
		 //calling insertion sort for sort the array
	    String[] words1=Utility.sorting(words);
	   //binary search to search the word
	    
	    Utility.binarySearch(words1,word);
	    scanner.close();
	}
 catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
