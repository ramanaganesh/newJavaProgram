package com.algorithmprograms;

import java.util.Scanner;

public class MonthlyPayment {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the principle");
	double p=s.nextInt();
	System.out.println("enter the year");
	double y=s.nextInt();
	System.out.println("enter the loan");
	double l=s.nextDouble();
	double n=12*y;
	double r=l/(12*100);
	double pow=Math.pow((1+r),-n );
	double pay=(p*r)/(1-pow);
	System.out.println(pay);
	s.close();
}
}
