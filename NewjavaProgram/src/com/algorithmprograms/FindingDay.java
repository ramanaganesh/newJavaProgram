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
	 * @param m month
	 * @param date date
	 */
static void dayOfWeek(int year,String m,int date)
{
	int add=(year%100)+((year%100)/4);
	// to find the year code
		int yearCode=add%7,mc=0,cc=0;
		/*
		 * 
		 * using switch case
		 * to find the month code
		 * 
		 */
	switch(m)
	{
		case "jan":mc=0;break;
		case "feb":mc=3;break;
		case "mar":mc=3;break;
		case "apr":mc=6;break;
		case "may":mc=1;break;
		case "jun":mc=4;break;
		case "jul":mc=6;break;
		case "aug":mc=2;break;
		case "sep":mc=5;break;
		case "oct":mc=0;break;
		case "nov":mc=3;break;
		case "dec":mc=5;break;
	}
	/*
	 * 
	 * using if loop 
	 * find the century code
	 * 
	 */
	if(year>=1700 && year<1800) cc=4;
	if(year>=1800 && year<1900) cc=2;
	if(year>=1900 && year<2000) cc=0;
	if(year>=2000 && year<2100) cc=6;
	if(year>=2100 && year<2200) cc=4;
	if(year>=2200 && year<2300) cc=2;
	if(year>=2300 && year<2400) cc=0;
	
	//add all the yearcode,monthcode and centurycode
	int last=yearCode+mc+cc+date;
    //to check the odd days
	last=last%7;
	/*
	 * 
	 * using switch case
	 * to print the day
	 * 
	 */
	switch(last)
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
