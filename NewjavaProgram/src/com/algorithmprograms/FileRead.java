package com.algorithmprograms;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;


public class FileRead {
	
	static public String[] StringFile() throws Exception
	{
	/*
	 * 
	 * filereader is used the read the file in specified location
	 * bufferreader is used to copy the file reference
	 * 
	 */
	FileReader fileReader=new FileReader(new File("/home/bridgelabz/welcome1.txt"));
	@SuppressWarnings("resource")
	BufferedReader bufferedReader=new BufferedReader(fileReader);
	
	String line;

	// array initializing to store list of words
	

	
	/*
	 * try to avoid the exception
	 * catch block to catch the exception
	 * 
	 */
	try
	{
	  /*
	   * using while loop
	   * bf.readLine() to read the words from file
	   * 
	   */
	  while((line = bufferedReader.readLine()) != null)
      {
         //split to split the list of words into word
          String[] words = line.split(" ");
         return words;
            
         
          }
      }
	
	  catch(IOException e)
	  {
		
	  }
	
	fileReader.close();
	
	return null;
}


}
