package com.datastructureprogram;

import java.util.Scanner;

public class CalenderPrint {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the year");
		int year=scanner.nextInt();
		System.out.println("enter the month in words");
		String month=scanner.next();
		Calender.print(month, year);
		scanner.close();
	}
}


