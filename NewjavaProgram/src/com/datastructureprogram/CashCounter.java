package com.datastructureprogram;
import java.util.Scanner;

public class CashCounter {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
   
     System.out.println("enter how many person in queue?");
     int num=s.nextInt();
     int ch;
     MyQueue q=new MyQueue(10);
     System.out.println("enter "+num+ " person added to queue");
     for(int i=0;i<num;i++)
     {
    	 String n=s.next();
    	 q.Enqueue(n);
     }
	do
	{
		
		System.out.println("---------bank cash counter-------");
		System.out.println("1.deposit \n2.withdraw \n3.No of people \n4.exit");
		System.out.println("enter ur choice");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:System.out.println("enter the amount to deposit");
		        int depositAmount=s.nextInt();
		        q.bankAmount(depositAmount,ch);
		        num--;
		        q.dequeue();
		        break;
		case 2:System.out.println("enter the amount to withdraw");
		        int withdraw=s.nextInt();
		        if(q.bankAmount(withdraw, ch)==true)
		        {
		        	num--;
		        	q.dequeue();
		        }
		        break;
		case 3:System.out.println("no of people in queue is "+q.isSize()); 
				break;
		case 4:System.exit(0);
		}
	}while(num>0);
	s.close();
}
}
