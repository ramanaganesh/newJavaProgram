/*
 * purpose:print the power of 2
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.functionalprogram;

/* 
 * Here we use the scanner import  
 * to getting an input from the user
 */

import java.util.Scanner;



public class PowerOf {

	/*
	 * This is main function
	 * To print the values of power of 2
	 * 
	 */
	
public static void main(String[] args) {
	//getting an input from the user with the help of scanner
	Scanner s=new Scanner(System.in);
	System.out.println("enter the N value");
	int n=s.nextInt();
	/*
	 * function call
	 * to print the power of 2
	 * 
	 */
	Utility.power(n);
    s.close();
}
}
