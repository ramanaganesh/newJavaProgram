/*
 * purpose:Stop Watch
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   23-10-2018
 ************************************************************/
package com.functionalprogram;

import java.util.Scanner;

public class StartAndStopWatch {
	/*
	 * This is main function
	 * To print the elapsed time
	 * 
	 */
public static void main(String[] args) {
	//creating an object for StopWatch class
	StopWatch stopWatch=new StopWatch();
	/*
	 * start()-start the stopwatch
	 * stop()-stop the stopwatch
	 */
	
	System.out.println("start the stopwatch press 1 ");
	Scanner scanner=new Scanner(System.in);
	int choice=scanner.nextInt();
	if(choice==1)
    	stopWatch.start();
	System.out.println(" enter 0 to stop the watch");
	choice=scanner.nextInt();
	if(choice==0)
	{
	  stopWatch.stop();
	
	}
	System.out.println("elapsed time between start and stop");
	  stopWatch.elapsedTime();
	scanner.close();
}
}
