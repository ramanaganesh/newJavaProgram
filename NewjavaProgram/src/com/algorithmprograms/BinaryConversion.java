/*
 * purpose:binary conversion 
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

public class BinaryConversion {

/*
 * This is main function
 * to call to convert decimal number into binary
 * 
 */
public static void main(String[] args) {
	//getting an input from the user with the help of scanner
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	int number=scanner.nextInt();
	/*
	 * function call
	 * to calculate the binary for given decimal number
	 * 
	 */
	String binaryNumber=Utility.toBinary(number);
	Utility.padding(binaryNumber);
	scanner.close();
}
}
