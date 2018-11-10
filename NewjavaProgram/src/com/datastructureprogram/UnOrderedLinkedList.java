package com.datastructureprogram;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;



public class UnOrderedLinkedList {


public static void main(String[] args) throws Exception {
	FileReader fr=new FileReader(new File("/home/bridgelabz/welcome1.txt"));
	BufferedReader bf=new BufferedReader(fr);
	String line;
	
	MyLinkedList l=new MyLinkedList();
	
	try
	{
	  while((line = bf.readLine()) != null)
      {
		  String words[] = line.split(" ");
		  for (int i = 0; i < words.length; i++) {
			  		//System.out.println(words[i]);
			  		l.add(words[i]);
			  }
		  System.out.print(l);
		  //l.search("allow");
		 // l.search("ramana");
		 // l.search("ramana");
			l.search("ramana");
			l.search("sir");
			l.search("i");
		  System.out.println("after search");
		  System.out.println(l);
      }         
	}
	catch(IOException e)
	  {
		
	  }
	
	
	fr.close();
}
}
