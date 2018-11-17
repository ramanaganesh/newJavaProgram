
/*
 * purpose:TIC-TAC-TOE	
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
 * Random: used to get random variables
 */

import java.util.Scanner;

public class TicTacToe {
	/*
	 * This is main function
	 * To print tic-tac-toe
	 * 
	 */
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	/*
	 * 
	 * declaring array to store the values
	 * 
	 */
	char cell[][]=new char[3][3];
	/*assigning initial value for all index as E
	 * using for loop
	 * initializing i=0
	 * i iterate upto 2	
	 * 
	 */
	for(int i=0;i<3;i++)
	{
		/*
		 * inner loop
		 * using for loop
		 * initializing j=0
		 * j iterate upto 2	
		 * 
		 */ 
		 
		for(int j=0;j<3;j++)
		{
			cell[i][j]='E';
		}
	}
	/*
	 * function call
	 * to play the game
	 *  
	 */
    Utility.play(cell);
    scanner.close();
}

}

