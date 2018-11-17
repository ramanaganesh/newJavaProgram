/*
 * purpose:An Anagram   Detection 
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;
import com.utility.*;
/* 
 * Here we use the scanner import  
 * to getting an input from the user
 */
import java.util.Scanner;

/*
 * This is main function
 * to find Anagram   Detection 
 * 
 */
public class AnagramDetection {
public static void main(String[] args) {
	//getting an input from the user with the help of scanner
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the first string");
	String firstString=scanner.nextLine();
	System.out.println("enter the second string");
	String secondString=scanner.nextLine();
	/*
	 * function call
	 * to check the anagram or not
	 * 
	 */
	Utility.isAnagram(firstString, secondString);
	scanner.close();
}
}
