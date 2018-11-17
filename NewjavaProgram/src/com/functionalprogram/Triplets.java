
/*
 * purpose:Sums to add zero
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

public class Triplets {
	/*
	 * This is main function
	 * To print triplets
	 * 
	 */
public static void main(String[] args) {
	/*
	 * getting an input from the user with the help of scanner
	 */
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the limits for array");
	int limit=scanner.nextInt();
	//declaring integer array to store the values
	int number[]=new int[limit];
	/*
	 * 
	 * using for loop
	 * initializing i=0
	 * i iterate upto n
	 * i increment
	 * 
	 */
	for(int i=0;i<limit;i++)
	{
		//read the input from the user
		number[i]=scanner.nextInt();
	}
	/*
	 * function call
	 * to print the triplets
	 *  
	 */
	Utility.triplets(number);
	scanner.close();
}
}
