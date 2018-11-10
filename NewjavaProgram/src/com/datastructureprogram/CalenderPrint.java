package com.datastructureprogram;

import java.util.Scanner;

public class CalenderPrint {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int year=s.nextInt();
		System.out.println("enter the month in words");
		String month=s.next();
		Calender1.print(month, year);
		s.close();
	}
}


