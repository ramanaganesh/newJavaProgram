/*
 * purpose:to  find   your   number
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

public class FindNum {
	/**
	 *  find funtion to check whether the number is or not using binary search 
	 * 
	 */
		static boolean b=false;	
	static void find()
	{
    //getting an input from the user with the help of scanner
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int N=s.nextInt();
	/*
	 * 
	 * using while loop
	 * to check the given  number is power of 2 or not 
	 * its not means again user enter another number
	 * check() is function call to check the number
	 * 
	 */
	while(check(N)!=false)
	{
		System.out.println("enter the number");
		N=s.nextInt();
		
	}
	/*
	 * array declaration
	 * to store upto n-1
	 * 
	 */
	int arr[]=new int[N];
	/*
	 * 
	 * using for loop
	 * initializing i=0;
	 * i iterate upto n-1
	 * 
	 */
	for (int i = 0; i < arr.length; i++) {
		arr[i]=i;
	}
			System.out.println("think your guess number");
			Binary.binarySearch1(arr);
			s.close();
	
	}
	private static boolean check(int n) {
		int pow=1;
	for (int i = 0; i < 1000; i++) {
		pow=pow*2;
		if(pow==n)
			return false;
	
	}
	return true;
	}
}
