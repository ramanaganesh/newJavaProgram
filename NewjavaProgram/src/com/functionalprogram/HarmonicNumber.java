/*
 * purpose:Harmonic number
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

public class HarmonicNumber {
	

	/*
	 * This is main function
	 * To print the nth Harmonic values
	 * 
	 */
	
public static void main(String[] args) {
	//getting an input from the user with the help of scanner
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	int number=scanner.nextInt();
	/*
	 * function call
	 * to print the harmonic series
	 * 
	 */
	Utility.harmonicSeries(number);
	scanner.close();
}
}
