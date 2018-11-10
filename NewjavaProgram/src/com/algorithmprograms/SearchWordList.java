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
import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchWordList {

/*
 * This is main function
 * to find Anagram   Detection 
 * 
 */

public static void main(String[] args) throws Exception {
	
	/*
	 * 
	 * filereader is used the read the file in specified location
	 * bufferreader is used to copy the file reference
	 * 
	 */
	FileReader fr=new FileReader(new File("/home/bridgelabz/welcome1.txt"));
	BufferedReader bf=new BufferedReader(fr);
	
	String line;
	//getting an input from the user with the help of scanner
	Scanner s=new Scanner(System.in);
	System.out.println("enter the search word");
	String w=s.next();
	// array initializing to store list of words
	
	String word[]=new String[1000];
	
	/*
	 * try to avoid the exception
	 * catch block to catch the exception
	 * 
	 */
	try
	{
	  /*
	   * using while loop
	   * bf.readLine() to read the words from file
	   * 
	   */
	  while((line = bf.readLine()) != null)
      {
         //split to split the list of words into word
          String[] words = line.split(" ");
          //calling insertion sort for sort the array
            word=Insertion.sorting(words);
           //binary search to search the word
            
            Binary.binarySearch(word, w);
            break;
         
          }
      }
	
	  catch(IOException e)
	  {
		
	  }
	
	fr.close();
	s.close();
}
}

