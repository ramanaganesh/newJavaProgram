package com.intefaceimplementation;

//import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.module.Address;
import com.module.Person;
import com.utility.FileWriteAndRead;

public class AddressBookImplementation implements AddressBook
{
	Scanner scanner=new Scanner(System.in);
	String path="",name;
	
	@Override
	public ArrayList<Object> addNewPerson(String path) 
	{
		
		
		String flag=null;
		String check=null;
		ArrayList arrayList=new ArrayList();

		
		
		
		try {
			FileWriter fileWriter=new FileWriter(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		do
		{	
			Person person=new Person();
			Address address=new Address();
		System.out.println("enter the first name");
		String firstName=scanner.next();
		person.setFirstName(firstName);
		System.out.println("enter the last name");
		String lastName=scanner.next();
		person.setLastName(lastName);
		System.out.println("enter the city");
		String cityName=scanner.next();
		address.setCity(cityName);
		System.out.println("enter the state");
		String stateName=scanner.next();
		address.setState(stateName);
		System.out.println("enter the zip code");
		long zipCode=scanner.nextLong();
		address.setZipCode(zipCode);
		System.out.println("enter the phone number in string number");
		String phoneNumber=scanner.next();
		address.setPhoneNumber(phoneNumber);
		System.out.println("do u want to add another person in the same file");
		flag=scanner.next();
		person.setAddress(address);
		    // System.out.println(person);
			arrayList.add(person);
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		//System.out.println(arrayList);
//		System.out.println(person);
		//person.address.s
		//FileWriteAndRead.fileWrite(person,path);
		}while(flag.equals("yes"));
		
		return arrayList;
	}
    
	@Override
	public void editExistingPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePersonInAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByZipcode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printout() {
		// TODO Auto-generated method stub
		
	}

}
