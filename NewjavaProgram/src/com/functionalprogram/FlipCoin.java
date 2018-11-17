/**
 * purpose:Flip Coin and print percentage of Heads and Tails
 *  
 *
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
 * ************************************************************/

package com.functionalprogram;
import com.utility.*;

/* 
 * Here we use the scanner import  
 * to getting an input from the user
 */

import java.util.Scanner;

public class FlipCoin {

	/*
	 * main function make use of calculate the percentage of tail and head
	 */
	
public static void main(String[] args) {
	
	//getting an input from the user with the help of scanner
	System.out.println("enter how many times to flip");
	Scanner scanner=new Scanner(System.in);
	int time=scanner.nextInt();
	/*
	 * function call
	 * to print the percentage of heads and tails
	 * 
	 */
	Utility.flipCoin(time);
	scanner.close();
}
}
