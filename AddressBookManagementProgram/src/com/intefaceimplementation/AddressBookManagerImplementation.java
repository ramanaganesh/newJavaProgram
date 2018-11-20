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
	@Override
	public ArrayList<Object> createNewAddressBook(String path)
	{
		AddressBookImplementation addressBookImplementation=new AddressBookImplementation();
		ArrayList<Object> arrayList=addressBookImplementation.addNewPerson(path);
		return arrayList;
	}

	@Override
	public void openAddressBook() 
	{
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
			 openBook(addressBook);
		 }
	 }
	}

	private void openBook(String addressBook) 
	{
		String path="/home/bridgelabz/address/"+addressBook;
		JSONParser parser=new JSONParser();
		ObjectMapper mapper=new ObjectMapper();
		try {
			Object obj = parser.parse(new FileReader(path));
			JSONArray array=new JSONArray();
			array=(JSONArray) obj;
			for (int i = 0; i < array.size(); i++)
			{
				System.out.println();
				Person person=mapper.readValue(array.get(i).toString(), Person.class);
				System.out.print(person.getFirstName()+" "+person.getLastName()+" "+person.getAddress());
			}
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	}

	@Override
	public void saveAddressBook(ArrayList<Object> arrayList,String path) 
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
