package com.datastructureprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class OrderedLinkedList {
	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);

		FileReader fileReader=new FileReader(new File("/home/bridgelabz/number.txt"));
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String line;
		int number[];
		MyLinkedList1 myLinkedList1=new MyLinkedList1();
		
		try
		{
		  while((line = bufferedReader.readLine()) != null)
	      {
			  String words[] = line.split(", ");
			  number=new int[words.length];
			  for (int i = 0; i <number.length; i++) {
				  		number[i]=Integer.parseInt(words[i]);
			  		myLinkedList1.add(number[i]);
				  }			
			 System.out.println(myLinkedList1);
			 String b=null;
			  do
			  {
				  System.out.println("enter the search number");
				  int searchNumber=scanner.nextInt();
				  myLinkedList1.search(searchNumber);
				  System.out.println("after search");
				  System.out.println(myLinkedList1);
				  System.out.println("u want to continue the search  yes or no");
				   b=scanner.next();
			  }while(b.equalsIgnoreCase("yes"));
			  
			 break;
			 // System.out.print(l);
			 /* l.search("allow");
			  l.search("ramana");
			  l.search("ramana");
			  System.out.println("after search");
			  System.out.println(l);*/
	      }         
		}
		catch(IOException e)
		  {
			
		  }
		
		
		fileReader.close();
		scanner.close();
	}
}