/*
 * purpose:Stop Watch
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   23-10-2018
 ************************************************************/
package com.functionalprogram;


public class StopWatch {

	//declaring variable for calculate the elapsed time
	long startTime=0;
	long stopTime=0;
	String run=null;
	long elapsedTime=0;
	/**
	 * this method is used to start the stopwatch
	 */
	void start()
	{
		/*
		 * System.currentTimeMillis()-used to get the time
		 */
		startTime=System.nanoTime();
		run="true";
	}
	/**
	 * this method is used to stop the stopwatch
	 */
	void stop()
	{
		/*
		 * System.currentTimeMillis()-used to get the time
		 */
		stopTime=System.nanoTime();
		run="false";
	}
	/**
	 * this method is used to print the elapsed time
	 */
	void elapsedTime()
	{
		/*
		 * 
		 * if:condition is true it print elapsed time with running stopwatch
		 * else:it print elapsed time by stoping the stopwatch 
		 * 		 
		 */
		if(run=="true")
		{
			elapsedTime=System.nanoTime()-startTime;
			System.out.println(elapsedTime);
		}
		else
		{
			elapsedTime=stopTime-startTime;
			System.out.println(elapsedTime);
		}
	}
}
