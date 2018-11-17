/*
 * purpose:permutation
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
 ************************************************************/
package com.functionalprogram;
import com.utility.*;

/* 
 * Here we use the scanner import  
 * to getting an input from the user
 */

import java.util.Scanner;

public class Permutatation {
public static void main(String[] args) {

	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the String");
	String word=scanner.next();
	/*
	 * function call
	 * to print the permutation
	 *  
	 */
    Utility.permutation(word.toCharArray(),0);
    scanner.close();
}


}