/*
 * purpose:temperature conversion
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;

public class Temperatute
{
	/**
	 * 
	 * @param temp its used to convert into fahrenheit and celsius
	 * 
	 */
static public  void conversion(int temp)
	{
	//formula to convert the temperature
	int f=(temp*9/5)+32;

	//print the result
	System.out.println(f+"°F");
	}
static public void conversion1(int temp)
{
	int c=(temp-32) * 5/9;
	System.out.println(c+"°C");
}
}
