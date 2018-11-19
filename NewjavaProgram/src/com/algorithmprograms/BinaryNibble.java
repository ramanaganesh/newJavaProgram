/*
 * purpose:binary Nibble 
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;

import java.util.Scanner;

import com.utility.Utility;

public class BinaryNibble {

/*
 * This is main function
 * to call to convert swap the binary values 
 * 
 */
public static void main(String[] args) {
	//getting an input from the user with the help of scanner
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number for nibble");
	int number=scanner.nextInt();
	/*
	 * 
	 * using while loop
	 * to check the value is less than 255
	 * 
	 */
	while(number>256)
	{
		System.out.println("enter the number below 256");
		number=scanner.nextInt();
	}
	/*
	 * function call
	 * to calculate the binary for given decimal number
	 * to swap the binary values and print the corresponding decimal number
	 * 
	 */
	String nibbleNumber=Bin.toBinary(number);
	Utility.nibbles(nibbleNumber);
	scanner.close();
}
}
