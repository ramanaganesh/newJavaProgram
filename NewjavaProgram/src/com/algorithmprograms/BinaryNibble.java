/*
 * purpose:binary Nibble 
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;

import java.util.Scanner;

public class BinaryNibble {

/*
 * This is main function
 * to call to convert swap the binary values 
 * 
 */
public static void main(String[] args) {
	//getting an input from the user with the help of scanner
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number for nibble");
	int n=s.nextInt();
	/*
	 * 
	 * using while loop
	 * to check the value is less than 255
	 * 
	 */
	while(n>256)
	{
		System.out.println("enter the number below 256");
		n=s.nextInt();
	}
	/*
	 * function call
	 * to calculate the binary for given decimal number
	 * to swap the binary values and print the corresponding decimal number
	 * 
	 */
	String number=Bin.toBinary(n);
	Bin.nibbles(number);
	s.close();
}
}
