/*
 * purpose:Stop Watch
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   23-10-2018
 ************************************************************/
package com.functionalprogram;

import java.util.Scanner;

public class StWatch {
	/*
	 * This is main function
	 * To print the elapsed time
	 * 
	 */
public static void main(String[] args) {
	//creating an object for StopWatch class
	StopWatch s=new StopWatch();
	/*
	 * start()-start the stopwatch
	 * stop()-stop the stopwatch
	 */
	
	System.out.println("start the stopwatch press 1 ");
	Scanner scanner=new Scanner(System.in);
	int choice=scanner.nextInt();
	if(choice==1)
    	s.start();
	System.out.println(" enter 0 to stop the watch");
	choice=scanner.nextInt();
	if(choice==0)
	{
	  s.stop();
	
	}
	System.out.println("elapsed time between start and stop");
	  s.elapsedTime();
	scanner.close();
}
}
