/*
 * purpose:Wind Chill
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
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the temperature");
	double temperature=scanner.nextDouble();
	System.out.println("enter the wind speed");
	double speed=scanner.nextDouble();
	
	/*
	 * function call
	 * to print the wind chill
	 *  
	 */
	Utility.findWindChill(temperature, speed);
	scanner.close();
}

}
