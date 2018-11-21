package com.intefaceimplementation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.module.Person;

import com.utility.FileWriteAndRead;

public class AddressBookManagerImplementation implements AddressBookManager
{
	Scanner scanner=new Scanner(System.in);
	int choice;
	String check;
	AddressBookImplementation addressBookImplementation=new AddressBookImplementation();

	@Override
	public List<Person> createNewAddressBook(String path)
	{
		List<Person> arrayList=addressBookImplementation.addNewPerson();
		return arrayList;
	}

	@Override
	public String openAddressBook() 
	{
		List<Person> personList=new ArrayList<>();
	File file=new File("/home/bridgelabz/address/")	;
	 File[] files = file.listFiles();
	 String fileName[]=new String[files.length];
	 int i=0;
	 System.out.println("which address book u want to open");
	 for(File f: files)
     {
    	 fileName[i]=f.getName();
    	 System.out.println(i+": "+fileName[i]);
    	  i++;
     }
	 String addressBook=scanner.next();
	 for (int j = 0; j < fileName.length; j++) 
	 {
		 if(fileName[j].equals(addressBook))
		 {
			 personList=openBook(addressBook);
		 }
	 }
	 return addressBook;
	}

	public static List<Person> openBook(String addressBook) 
	{
		String path="/home/bridgelabz/address/"+addressBook;
		JSONParser parser=new JSONParser();
		ObjectMapper mapper=new ObjectMapper();
		List<Person> editPersonList=new ArrayList<>();
		List<Person> personList=new ArrayList<>();
		File file=new File(path);
		if(file.length()==0)
			System.out.println("file is empty please write/save this file");
		else
		{
			try 
			{
				Object obj = parser.parse(new FileReader(path));
				JSONArray array=new JSONArray();
				
				array=(JSONArray) obj;
				for (int i = 0; i < array.size(); i++)
				{
					System.out.println();
					personList.add(mapper.readValue(array.get(i).toString(), Person.class));
					System.out.println(i);
				}
				System.out.println("HI"+personList);
					System.out.println();
					
					
		
			}
			catch (IOException | ParseException e) 
			{
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	return  personList;
	}

	@Override
	public void saveAddressBook(List<Person> arrayList,String path) 
	{
		
				FileWriteAndRead.fileWrite(arrayList,path);
	}
		
	

	@Override
	public void closeAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quitAddressBook() {
		// TODO Auto-generated method stub
		
	}

}
