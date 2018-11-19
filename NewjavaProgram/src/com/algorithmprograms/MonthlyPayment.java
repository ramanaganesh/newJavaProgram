package com.algorithmprograms;

import java.util.Scanner;

import com.utility.Utility;

public class MonthlyPayment {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the principle");
	double principle=scanner.nextInt();
	System.out.println("enter the year");
	double year=scanner.nextInt();
	System.out.println("enter the loan");
	double loan=scanner.nextDouble();
	Utility.calculateMonthlyPayment(principle,year,loan);
	
	scanner.close();
}
}
