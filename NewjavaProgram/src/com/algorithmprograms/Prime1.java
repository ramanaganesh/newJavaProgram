/*
 * purpose:to print prime number between 1 to 1000
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;

import java.util.Scanner;

public class Prime1 {
	/*
	 * This is main function
	 * to find Anagram   Detection 
	 * 
	 */
public static void main(String[] args) {
	/*
	 * function call
	 * to print the prime numbers
	 * 
	 */
	Scanner s=new Scanner(System.in);
	System.out.println("enter the range between 1-1000");
	int count=s.nextInt();
	int coun=PrimeNumber.isPrime(count);
	System.out.println("displaying anagram");
	PrimeNumber.anagramDisplay(coun);
	s.close();
}
}
