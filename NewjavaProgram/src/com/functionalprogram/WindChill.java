/*
 * purpose:Wind Chill
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

public class WindChill {
	/*
	 * This is main function
	 * To print windmill speed
	 * 
	 */
public static void main(String[] args) {
	/*
	 * getting an input from the user with the help of scanner
	 */
	Scanner s=new Scanner(System.in);
	System.out.println("enter the temperature");
	double temp=s.nextDouble();
	System.out.println("enter the wind speed");
	double v=s.nextDouble();
	
	/*
	 * function call
	 * to print the wind chill
	 *  
	 */
	Utility.findWindChill(temp, v);
	s.close();
}

}
