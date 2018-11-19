/*
 * purpose:vending machine 
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;
/* 
 * Here we use the scanner import  
 * to getting an input from the user
 */
import java.util.Scanner;

public class Machine {
	
	static Scanner scanner=new Scanner(System.in);
	static int remainingAmount=0,count=0,balance=10000;
	static int rupeeCount[]= {100,100,100,100,100,100,100,100,100};
	/**
	 * 
	 * @return return the total amount
	 * 
	 */
	static int menu() 
	{
		String check;int initial=0;
		/*
		 * 
		 * using do while loop
		 * iterate upto c=no;
		 * 
		 */
		do
		{
		System.out.println("welcome");
		//these are the choice in menu
		
		System.out.println("1.snickers-20 \n2.pepsi-40 \n3.lays-50 \n4.buiscuit-100");
		System.out.println("enter ur choice ");
		int choice=scanner.nextInt();
		/*
		 * 
		 * function call to get the amount of particular product
		 * 
		 */
		 initial = initial+priceAmount(choice);
		System.out.println("you want more yes/no");
		check=scanner.next();
		}while(check.equals("yes"));
		return  initial;
	}

	/**
	 * 
	 * @param food its getting an option 
	 * @return price of the product
	 */
	public static int priceAmount(int food) 
	{
		if(food==1)
			return 20;
		else if(food==2)
			return 40;
		else if(food==3)
			return 50;
		else
			return 100;
	}
	/**
	 * 
	 * @param price its used to get the remaining amount to the user
	 * @return balance
	 */
	public static int change(int price) 
	{
		System.out.println("ur item cost "+price);
		System.out.println("insert the amount ");
		int amount=scanner.nextInt();
		/*
		 * 
		 * function call to check the machine balance
		 * 
		 */
		boolean flag=machineBalance(amount);
		if(flag)
		{
		while(amount<price)
		{
			System.out.println("give sufficient amount");
			amount=scanner.nextInt();
		}
		return amount-price;
		}
		else
		{
			System.out.println("dosent have sufficient balance try another machine");
			return -1;
		}
	}

	/**
	 * 
	 * @param amount its check the balance
	 * @return true or false
	 */
	private static boolean machineBalance(int amount) 
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			return true;
		}

			return false;
	}
	/**
	 * 
	 * @param change is used to give change amount to user with minimum note
	 * 
	 */
	public static void changeout(int change)
	{
	/*
	 * 
	 * using while loop
	 * itearte upto arr[0]!=0 && change>=1000
	 * 
	 */
	while(change>=1000 && rupeeCount[0]!=0)
	{
		
		change=change-1000;
		
		count++;
		rupeeCount[0]--;
		
	}
	/*
	 * 
	 * if: count!=0 print the how much 1000 rupees notes to user
	 * then count=0;
	 * 
	 */
		if(count!=0)
		{
		System.out.println(1000+" * "+count+"="+(1000*count));
		count=0;
		}
	while(change>=500&& rupeeCount[1]!=0)
	{
		
		change=change-500;
		count++;
		rupeeCount[1]--;
	}
		if(count!=0)
		{
		System.out.println(500+" * "+count+"="+(500*count));
		count=0;
		}

	while(change>=200&& rupeeCount[2]!=0)
	{
		
		change=change-200;
		count++;
		rupeeCount[2]--;
	}
		if(count!=0)
		{
		System.out.println(200+" * "+count+"="+(200*count));
		count=0;
		}

	while(change>=100&& rupeeCount[3]!=0)
	{
		change=change-100;
		count++;
		rupeeCount[3]--;
	}	
		if(count!=0)
		{
		System.out.println(100+" * "+count+"="+(100*count));
		count=0;
		}

	while(change>=50&& rupeeCount[4]!=0)
	{
		change=change-50;
		count++;
		rupeeCount[4]--;
	}	
		if(count!=0)
		{
		System.out.println(50+" * "+count+"="+(50*count));
		count=0;
		}

	while(change>=20&& rupeeCount[5]!=0)
	{
		change=change-20;
		count++;
		rupeeCount[5]--;
	}
		if(count!=0)
		{
		System.out.println(20+" * "+count+"="+(20*count));
		count=0;
		}

	while(change>=10&& rupeeCount[6]!=0)
	{
		change=change-10;
		count++;
		rupeeCount[6]--;	
	}
		if(count!=0)
		{
		System.out.println(10+" * "+count+"="+(10*count));
		count=0;
		}
	while(change>=5&& rupeeCount[7]!=0)
	{
		change=change-5;
		count++;
		rupeeCount[7]--;
	}
		if(count!=0)
		{
		System.out.println(5+" * "+count+"="+(5*count));
		count=0;
		}

	while(change>=1&& rupeeCount[8]!=0)
	{
		change=change-1;
		count++;
		rupeeCount[8]--;
	}	
		if(count!=0)
		{
		System.out.println(1+" * "+count+"="+(1*count));
		count=0;
		}
	}
}
