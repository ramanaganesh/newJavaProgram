/*
 * purpose:day of the week
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;
public class FindingDay {
	/**
	 * 
	 * @param year year
	 * @param month month
	 * @param date date
	 */
static public  void dayOfWeek(int year,String month,int date)
{
	int add=(year%100)+((year%100)/4);
	// to find the year code
		int yearCode=add%7,monthCode=0,centuryCode=0;
		/*
		 * 
		 * using switch case
		 * to find the month code
		 * 
		 */
	switch(month)
	{
		case "jan":monthCode=0;break;
		case "feb":monthCode=3;break;
		case "mar":monthCode=3;break;
		case "apr":monthCode=6;break;
		case "may":monthCode=1;break;
		case "jun":monthCode=4;break;
		case "jul":monthCode=6;break;
		case "aug":monthCode=2;break;
		case "sep":monthCode=5;break;
		case "oct":monthCode=0;break;
		case "nov":monthCode=3;break;
		case "dec":monthCode=5;break;
	}
	/*
	 * 
	 * using if loop 
	 * find the century code
	 * 
	 */
	if(year>=1700 && year<1800) centuryCode=4;
	if(year>=1800 && year<1900) centuryCode=2;
	if(year>=1900 && year<2000) centuryCode=0;
	if(year>=2000 && year<2100) centuryCode=6;
	if(year>=2100 && year<2200) centuryCode=4;
	if(year>=2200 && year<2300) centuryCode=2;
	if(year>=2300 && year<2400) centuryCode=0;
	
	//add all the yearcode,monthcode and centurycode
	int lastValue=yearCode+monthCode+centuryCode+date;
    //to check the odd days
	lastValue=lastValue%7;
	/*
	 * 
	 * using switch case
	 * to print the day
	 * 
	 */
	switch(lastValue)
	{
	case 0:System.out.println("sunday");break;
	case 1:System.out.println("monday");break;
	case 2:System.out.println("tuesday");break;
	case 3:System.out.println("wednesday");break;
	case 4:System.out.println("thursday");break;
	case 5:System.out.println("friday");break;
	case 6:System.out.println("saturday");break;
	}
	}

			
}
