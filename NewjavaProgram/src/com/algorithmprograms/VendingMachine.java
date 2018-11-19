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

import com.utility.Utility;

public class VendingMachine {
	/*
	 * This is main function
	 * to calling for getting change 
	 * 
	 */
public static void main(String[] args) {
	//getting an input from the user with the help of scanner
	Scanner scanner=new Scanner(System.in);
	String choice;
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
	int amount=Utility.menu();
	int change=Utility.change(amount);
	/*
	 * if loop for checking balance in machine or not
	 * 
	 */
	if(change!=-1)
	{
	Utility.changeout(change);
	System.out.println("thank u fr service");
	}
	else
	{
	    System.out.println("sorry for the service");
	    break;
	}
	//getting an input from the user with the help of scanner
	System.out.println("enter the amount to change");
	 int changeAmount=scanner.nextInt();
	 /*
		 * 
		 * function call for change
		 * 
		 */
	 Utility.changeout(changeAmount);
	 System.out.println("try again another shop");
	 choice=scanner.next();
}while(choice.equals("yes"));
	scanner.close();
}

}
