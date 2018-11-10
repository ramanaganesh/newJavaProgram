package com.datastructureprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class OrderedLinkedList {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader(new File("/home/bridgelabz/number.txt"));
		BufferedReader bf=new BufferedReader(fr);
		String line;
		int arr[];
		MyLinkedList1 l=new MyLinkedList1();
		
		try
		{
		  while((line = bf.readLine()) != null)
	      {
			  String words[] = line.split(", ");
			  arr=new int[words.length];
			  for (int i = 0; i <arr.length; i++) {
				  		arr[i]=Integer.parseInt(words[i]);
			  		l.add(arr[i]);
				  }			
			 System.out.println(l);
			 l.search(1);
			 l.search(2);
			 System.out.println("after search");
			 System.out.println(l);
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
		
		
		fr.close();
	}
}