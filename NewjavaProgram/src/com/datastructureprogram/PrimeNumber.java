package com.datastructureprogram;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("enter the number ");
	Scanner s=new Scanner(System.in);
	int lim=s.nextInt();
	int arr[][]=new int[lim+1][lim+1];
	int prime[][]=new int[lim+1][lim/10];
	int val[]=new int[lim/10];
	int count=0;
	boolean b=false;
	for(int i=100;i<=lim;i+=100)
	{
			System.out.println("the prime numbers between "+(i-100)+" to "+i);
		
		for(int j=PrimeCheck.check(i);j<=j;)
		{
			arr[i][j]=j;
			System.out.println(i+" "+j+" "+arr[i][j]);
			break;
		}
	}
	System.out.println();
	for (int i = 100; i <=lim; i+=100) 
	{
		for(int j=0;j<=100;j++)
		{
			if(arr[i][j]!=0)
			{
				//System.out.println(i+" "+j+" "+arr[i][j]);
				for(int k=(i-100);k<=i;k+=101)
				{
						System.out.println("i="+i);
						val=PrimeCheck.check1(i);
						for(int l=0;l<j;l++)
						{
							prime[i][l]=val[l];
							System.out.println(i+" "+l+" "+prime[i][l]);
						}
						
				}
				
			}
		}
	}
	val=PrimeCheck.isPrime(lim);
	for(int i=0;i<val.length-2;i++)
	{
		for(int j=i+1;j<val.length;j++)
		{
			if(val[i]!= 0 && val[j]!=0)
			{
				
			 b=Anagram.isAnagram(val[i], val[j]);
			
			if(b==true)
			{
				count++;
			}
		
			}
	}
	}
	MyStack m=new MyStack(count*2);
	for(int i=0;i<val.length-2;i++)
	{
		for(int j=i+1;j<val.length;j++)
		{
			if(val[i]!= 0 && val[j]!=0)
			{
				//System.out.println(val[i]+" "+val[j]);
			 b=Anagram.isAnagram(val[i], val[j]);
			//System.out.println(val[i]+" "+val[j]);
			if(b==true)
			{
				m.push(val[i]);
				m.push(val[j]);
			}
		
			}
	}
	}
	System.out.println("stack push");
	System.out.println(m);
	
	MyQueue q=new MyQueue(count*2);
	for(int i=0;i<val.length-2;i++)
	{
		for(int j=i+1;j<val.length;j++)
		{
			if(val[i]!= 0 && val[j]!=0)
			{
				//System.out.println(val[i]+" "+val[j]);
			 b=Anagram.isAnagram(val[i], val[j]);
			//System.out.println(val[i]+" "+val[j]);
			if(b==true)
			{
				q.Enqueue(val[i]);
				q.Enqueue(val[j]);
			}
		
			}
	}
	}
	System.out.println("queue push");
	System.out.println(q);
	s.close();
}
}

