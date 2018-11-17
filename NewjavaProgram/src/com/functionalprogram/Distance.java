/*
 * purpose:prints the Euclidean distance
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

public class Distance {
	/*
	 * This is main function
	 * To calculate the distance with the help of euclidean formula
	 * 
	 */
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);

	/*
	 * getting an input from the user with the help of scanner
	 */
	System.out.println("enter the two points ");
	int x1=scanner.nextInt(),y1=scanner.nextInt();
	/*
	 * function call
	 * to print the distance between one points to origin
	 * 
	 *  
	 */
	Utility.distance(x1, y1);
	scanner.close();
}
}
