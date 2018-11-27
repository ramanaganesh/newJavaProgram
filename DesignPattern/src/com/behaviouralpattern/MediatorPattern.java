package com.behaviouralpattern;

import java.util.Scanner;

public class MediatorPattern 
{
public static void main(String[] args) {
	User aman=new User("aman");
	User ramana=new User("ramana");
	String choice;
	Scanner scanner=new Scanner(System.in);
	do
	{
		System.out.println("type the message");
		String conv1=scanner.nextLine();
	aman.sendMessageToChatRoom(conv1);
	String conv2=scanner.nextLine();
	ramana.sendMessageToChatRoom(conv2);
	System.out.println("u want to continue ur chat conversation yes/no");
	choice=scanner.nextLine();
	}while(choice.equals("yes"));
	scanner.close();
}
}
