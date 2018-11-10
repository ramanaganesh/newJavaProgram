/*
 * purpose:An Anagram   Detection 
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;

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
public class Main {
public static void main(String[] args) {
	//getting an input from the user with the help of scanner
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first string");
	String st1=s.nextLine();
	System.out.println("enter the second string");
	String st2=s.nextLine();
	/*
	 * function call
	 * to check the anagram or not
	 * 
	 */
	Util.isAnagram(st1, st2);
	s.close();
}
}
