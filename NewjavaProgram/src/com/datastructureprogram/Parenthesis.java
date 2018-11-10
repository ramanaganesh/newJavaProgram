package com.datastructureprogram;

import java.util.Scanner;

public class Parenthesis {
public static void main(String[] args) {
	MyStack s=new MyStack(10);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the experssion");
	String exp=sc.next();
	char ch[]=exp.toCharArray();
	
	for(int i=0;i<exp.length();i++)
	{
		if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
		{
					s.push(ch[i]);
					
		}
		else if(((char)s.peek()=='(' && ch[i]==')') ||
				((char)s.peek()=='{' && ch[i]=='}') ||
				((char)s.peek()=='[' && ch[i]==']'))
						s.pop();
		
	}
	
	if(s.isEmpty())
	{
		System.out.println("string balanced");
	}
	else
	{
		System.out.println("not balanced");
	}
	sc.close();
}
}
