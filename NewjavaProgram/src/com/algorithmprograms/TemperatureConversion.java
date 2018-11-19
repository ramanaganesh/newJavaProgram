/*
 * purpose:temperature conversion
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;
/* 
 * Here we use the scanner import  
 * to getting an input from the user
 */
import java.util.Scanner;

import com.utility.Utility;

public class TemperatureConversion {
public static void main(String[] args) {
	//getting an input from the user with the help of scanner
	Scanner scanner=new Scanner(System.in);

	/*
	 * function call
	 * to print the temperature in fahrenheit and celsius
	 * 
	 */
	System.out.println("enter the temperature in celsius");
	int temperature=scanner.nextInt();
	Utility.conversionToFahrenheit(temperature);
	System.out.println("enter the temperature in fahrenheit");
	temperature=scanner.nextInt();
	Utility.conversionToCelsius(temperature);
	scanner.close();
}
}
