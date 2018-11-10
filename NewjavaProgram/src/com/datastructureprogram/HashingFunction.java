package com.datastructureprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HashingFunction {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader(new File("/home/bridgelabz/number.txt"));
		BufferedReader bf=new BufferedReader(fr);
		String line;
		int arr[];
		Hash h=new Hash();
		
		try
		{
		  while((line = bf.readLine()) != null)
	      {
			  String words[] = line.split(", ");
			  arr=new int[words.length];
			  for (int i = 0; i <12; i++) {
				  		arr[i]=Integer.parseInt(words[i]);
				  		h.add(arr[i]);
}
	      }
		  System.out.println(h);
		  	/*h.search(11);
			System.out.println("after");
			System.out.println(h);*/
		}
		catch(IOException e)
		  {
			
		  }
	}
}
		