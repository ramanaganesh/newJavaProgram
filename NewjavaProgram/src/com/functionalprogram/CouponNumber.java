/*
 * purpose:coupon number
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   23-10-2018
 ************************************************************/
package com.functionalprogram;
import com.utility.*;

/* 
 * Here we use the scanner import  
 * to getting an input from the user
 * Random: used to get random variables
 */



import java.util.Scanner;

public class CouponNumber {
	/*
	 * This is main function
	 * To print the distinct coupon numbers
	 * 
	 */
	public static void main(String[] args) {
		
		/*
		 * getting an input from the user with the help of scanner
		 * lim is used to declared as length of the coupon
		 * cno is used as quantity of coupon
		 * 
		 * 
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the limit for coupon number");
		int limit=scanner.nextInt();
	
		/*
		 * function call
		 * to print generate thre coupon number is distinct or not
		 *  
		 */
		Utility.couponNumber(limit);
		scanner.close();
	}
	

}
