/*
 * purpose:to print prime number between 1 to 1000
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;
import com.utility.*;
import java.util.Scanner;

public class PrimeNumber {
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
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the range between 1-1000");
	int range=scanner.nextInt();
	int count=Utility.isPrime(range);
	System.out.println("displaying anagram");
	Utility.anagramDisplay(count);
	scanner.close();
}
}
