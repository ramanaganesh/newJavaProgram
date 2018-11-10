/*
 * purpose:vending machine 
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

public class VendingMachine {
	/*
	 * This is main function
	 * to calling for getting change 
	 * 
	 */
public static void main(String[] args) {
	//getting an input from the user with the help of scanner
	Scanner s=new Scanner(System.in);
	String ch;
	/*
	 * 
	 * using do while loop
	 * iterate upto ch=no;
	 * 
	 */
	do
	{
		/*
		 * 
		 * function call for choose menu and change
		 * 
		 */
	int amount=Machine.menu();
	int change=Machine.change(amount);
	/*
	 * if loop for checking balance in machine or not
	 * 
	 */
	if(change!=-1)
	{
	Machine.changeout(change);
	System.out.println("thank u fr service");
	}
	else
	{
	    System.out.println("sorry for the service");
	    break;
	}
	//getting an input from the user with the help of scanner
	System.out.println("enter the amount to change");
	 int amt=s.nextInt();
	 /*
		 * 
		 * function call for change
		 * 
		 */
	 Machine.changeout(amt);
	 System.out.println("try again another shop");
	 ch=s.next();
}while(ch.equals("yes"));
	s.close();
}

}
