package com.datastructureprogram;

import java.util.Scanner;

public class PossibleBinaryTree {
public static void main(String[] args) 
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the limits");
	int limit=scanner.nextInt();
	int number[]=new int[limit];
	for(int i=0;i<limit;i++)
	{
		System.out.println("enter the number");
		number[i]=scanner.nextInt();
		long x=Factorial.catalanNumber(number[i]);
		System.out.println("the possible number of "+number[i]+" node is "+x);
	}
	scanner.close();
}
}
