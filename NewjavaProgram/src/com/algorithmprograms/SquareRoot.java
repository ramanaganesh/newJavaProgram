package com.algorithmprograms;

import java.util.Scanner;

public class SquareRoot {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	double num=s.nextDouble();
	double epsilon=1e-15;
	while(num<0)
	{
	System.out.println("enter another number");	
	num=s.nextInt();
	}
	double t=num;
	while(  Math.abs(t-num/t)   >   epsilon*t  )
	{
		t=((num/t)+t)/2.0;
	}
	System.out.println(t);
	s.close();
}
}
