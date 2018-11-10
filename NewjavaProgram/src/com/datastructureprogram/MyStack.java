package com.datastructureprogram;

public class MyStack {
Object obj[];
int top=-1,cap=0;
public MyStack(int scap) {
	this.cap=scap;
	obj=new Object[cap];
}
boolean push(Object data)
{
	
	if(top==cap-1)
	{
		System.out.println("stack overflow");
		return false;
	}
	obj[++top]=data;
	return true;
}

Object pop()
{
	if(top==-1)
	{
		System.out.println("stack underflow");
		return false;
	}
	return obj[top--]; 
	
}

Object peek()
{
	if(top==-1)
	{
		return 'a';
	}
	else
		return obj[top];
		
}
boolean isEmpty()
{
	if(top==-1)
	{
		return true;
	}
	return false;
}
@Override
	public String toString() {
	for(int i=0;i<=top;i++)
	{
		System.out.println(obj[i]+" ");
	}
	return "";
	}
}
