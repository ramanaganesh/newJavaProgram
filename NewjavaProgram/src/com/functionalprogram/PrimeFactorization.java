/*
 * purpose:Prime Factorization
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

public class PrimeFactorization {

	/*
	 * This is main function
	 * To print the prime factor for the given number
	 * 
	 */
public static void main(String[] args) {
	
	//getting an input from the user with the help of scanner
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	long num=s.nextLong();
	/*
	 * function call
	 * to print the prime factorization
	 * 
	 */
	Utility.factor(num);
	s.close();
}
}