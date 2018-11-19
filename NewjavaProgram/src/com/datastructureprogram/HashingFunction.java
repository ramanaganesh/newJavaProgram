package com.datastructureprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HashingFunction {
	public static void main(String[] args) throws Exception {
		FileReader fileReader=new FileReader(new File("/home/bridgelabz/number.txt"));
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String line;
		int number[];
		Hash hash=new Hash();
		
		try
		{
		  while((line = bufferedReader.readLine()) != null)
	      {
			  String words[] = line.split(", ");
			  number=new int[words.length];
			  for (int i = 0; i <number.length; i++) {
				  		number[i]=Integer.parseInt(words[i]);
				  		hash.add(number[i]);
}
	      }
		  System.out.println(hash);
		  	/*h.search(11);
			System.out.println("after");
			System.out.println(h);*/
		}
		catch(IOException e)
		  {
			
		  }
	}
}
		