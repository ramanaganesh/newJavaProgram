/*
 * purpose:permutation
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
 ************************************************************/
package com.functionalprogram;
/* 
 * Here we use the scanner import  
 * to getting an input from the user
 */

import java.util.Scanner;

public class Permutatation {
public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	System.out.println("enter the String");
	String a=s.next();
	/*
	 * function call
	 * to print the permutation
	 *  
	 */
    Utility.permutation(a.toCharArray(),0);
    s.close();
}


}