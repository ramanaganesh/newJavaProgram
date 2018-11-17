/*
 * purpose:Gambler
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

public class Gambler {
	/*
	 * 
	 *  This is main function
	 *  Simulates a gambler who start with $stake and place fair $1 bets
	 *  until she goes broke or reach $goal. Keeps track of the number of
	 *  times she wins and the number of bets she makes. Run the experiment N
	 *  times, averages the results, and prints them out.
	 *  
	 */
	
public static void main(String[] args) {


	//getting an input from the user with the help of scanner
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the stake amount");
	int stake=scanner.nextInt();
	System.out.println("enter the goal");
	int goal=scanner.nextInt();
	System.out.println("enter the trail");
	int trial=scanner.nextInt();
	/*
	 * function call
	 * to print the win and win percentage and average bets
	 *  
	 */
	Utility.gambler(stake, goal, trial);
	scanner.close();
}
}