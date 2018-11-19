package com.datastructureprogram;
import java.util.Scanner;

public class CashCounter {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
   
     System.out.println("enter how many person in queue?");
     int numberOfPerson=scanner.nextInt();
     int choice;
     MyQueue myQueue=new MyQueue(numberOfPerson);
     System.out.println("enter "+numberOfPerson+ " person added to queue");
     for(int i=0;i<numberOfPerson;i++)
     {
    	 String name=scanner.next();
    	 myQueue.Enqueue(name);
     }
	do
	{
		
		System.out.println("---------bank cash counter-------");
		System.out.println("1.deposit \n2.withdraw \n3.No of people \n4.exit");
		System.out.println("enter ur choice");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:System.out.println("enter the amount to deposit");
		        int depositAmount=scanner.nextInt();
		        myQueue.bankAmount(depositAmount,choice);
		        numberOfPerson--;
		        myQueue.dequeue();
		        break;
		case 2:System.out.println("enter the amount to withdraw");
		        int withdraw=scanner.nextInt();
		        if(myQueue.bankAmount(withdraw, choice)==true)
		        {
		        	numberOfPerson--;
		        	myQueue.dequeue();
		        }
		        break;
		case 3:System.out.println("no of people in queue is "+myQueue.isSize()); 
				break;
		case 4:System.exit(0);
		}
	}while(numberOfPerson>0);
	scanner.close();
}
}
