package com.datastructureprogram;

import java.util.Scanner;

public class PossibleBinaryTree {
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the limits");
	int lim=s.nextInt();
	int arr[]=new int[lim];
	for(int i=0;i<lim;i++)
	{
		System.out.println("enter the number");
		arr[i]=s.nextInt();
		long x=Factorial.catalanNumber(arr[i]);
		System.out.println("the possible number of "+arr[i]+" node is "+x);
	}
	s.close();
}
}
