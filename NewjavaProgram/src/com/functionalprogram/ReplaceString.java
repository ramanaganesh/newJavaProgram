
/*
 * purpose:take user input and then replace string
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
 * ************************************************************/
package com.functionalprogram;
import com.utility.*;

/* 
 * Here we use the scanner import  
 * to getting an input from the user
 */

import java.util.Scanner;

public class ReplaceString {
	/*
	 * main function make use to replace string
	 */
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	//getting an input string from the user with the help of scanner
	System.out.println("the input string is");
	String sentence=scanner.nextLine();
	String word[]=sentence.split(" ");
	
	/*
	 * function call
	 * to print the sentence
	 * 
	 */
	Utility.replaceString(word);
	scanner.close();
}
}
