
/*
 * purpose:Array 2-D
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



public class Quadratic {
	/*
	 * This is main function
	 * To print 2 roots for the equation 
	 * 
	 */
public static void main(String[] args) {
	/*
	 * getting an input from the user with the help of scanner
	 */
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the a,b,c values");
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	int c=scanner.nextInt();
	/*
	 * function call
	 * to print the roots
	 *  
	 */
	Utility.quadratic(a, b, c);
	scanner.close();
}
}
