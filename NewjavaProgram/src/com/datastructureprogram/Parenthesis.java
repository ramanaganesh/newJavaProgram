package com.datastructureprogram;

import java.util.Scanner;

public class Parenthesis {
public static void main(String[] args) {
	MyStack myStack=new MyStack(10);
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the experssion");
	String expression=scanner.next();
	char character[]=expression.toCharArray();
	int flag=0;
	for(int i=0;i<expression.length();i++)
	{
		if(character[i]=='(' || character[i]=='{' || character[i]=='[')
		{
					myStack.push(character[i]);
					
		}
		else if(((char)myStack.peek()=='(' && character[i]==')') ||
				((char)myStack.peek()=='{' && character[i]=='}') ||
				((char)myStack.peek()=='[' && character[i]==']'))
						myStack.pop();
		else if((char)myStack.peek()=='a')
		{
			
			if(flag==1)
				myStack.pop();
			flag++;
		}
		
	}
	
	if(myStack.isEmpty()&& flag==0)
	{
		System.out.println("string balanced");
	}
	else
	{
		System.out.println("not balanced");
	}
	scanner.close();
}
}
