package com.datastructureprogram;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class UnOrderedLinkedList {


public static void main(String[] args) throws Exception {
	FileReader fileReader=new FileReader(new File("/home/bridgelabz/welcome1.txt"));
	BufferedReader bufferedReader=new BufferedReader(fileReader);
	String line;
	Scanner scanner=new Scanner(System.in);
	MyLinkedList linkedList=new MyLinkedList();
	
	try
	{
	  while((line = bufferedReader.readLine()) != null)
      {
		  String words[] = line.split(" ");
		  for (int i = 0; i < words.length; i++) {
			  		//System.out.println(words[i]);
			  		linkedList.add(words[i]);
			  }
		  System.out.print(linkedList);
		
		  String check=null;
		  do
		  {
			  System.out.println("enter the search word");
			  String word=scanner.next();
			  linkedList.search(word);
			  System.out.println("after search");
			  System.out.println(linkedList);
			  System.out.println("u want to continue the search  yes or no");
			  check=scanner.next();
		  }while(check.equalsIgnoreCase("yes"));
		  
      }         
	}
	catch(IOException e)
	  {
		
	  }
	
	
	fileReader.close();
	scanner.close();
}
}
