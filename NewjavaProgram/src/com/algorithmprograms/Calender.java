/*
 * purpose:day of the week
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;
import java.util.Scanner;

public class Calender {

/*
 * This is main function
 * to call dayofweek to get day
 * 
 */
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the year");
	int year=s.nextInt();
	System.out.println("enter the month in words");
	String month=s.next();
	System.out.println("enter the date");
	int date=s.nextInt();
	System.out.println("the day of the date is ");
	/*
	 * function call
	 * to print the day
	 * 
	 */
	FindingDay.dayOfWeek(year,month,date);
	s.close();
}
}
