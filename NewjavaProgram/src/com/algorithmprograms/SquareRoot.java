package com.algorithmprograms;

import java.util.Scanner;

import com.utility.Utility;

public class SquareRoot {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	double number=scanner.nextDouble();
	Utility.findingSquareRoot(number);

	scanner.close();
}
}
