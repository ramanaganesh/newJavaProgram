package com.addressbookmanagementprogram;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.intefaceimplementation.AddressBookImplementation;
import com.intefaceimplementation.AddressBookManagerImplementation;
import com.module.Person;
import com.utility.FileWriteAndRead;

public class AddressBookProgram 
{
	static List<Person> personList=new ArrayList<>();
	static String addressBookName=null;
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		
		int choice;String name,path,check;
		List<Person> arrayList=new ArrayList<>();
		do
		{		System.out.println("ADDRESS    BOOK    MANAGER    PROGRAM");
				System.out.println("-------------------------------------");
				System.out.println("\n1.new \n2.open \n3.save \n4.save as \n5.close");
				System.out.println("enter ur choice");
				choice=scanner.nextInt();
				AddressBookManagerImplementation addressBookManagerImplementation=new AddressBookManagerImplementation();
				File file=new File("/home/bridgelabz/address/");
			switch (choice) {
			case 1:
				   System.out.println("create new address book");
				   
				   System.out.println("enter the file name");
					name=scanner.next();
					path="/home/bridgelabz/address/"+name+".json";
				//	System.out.println("length="+file.listFiles().length);
				   if(file.listFiles().length==0)
				   {
				     arrayList=addressBookManagerImplementation.createNewAddressBook(path);

						try {
							FileWriter fileWriter=new FileWriter(path);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
				   }
				   else
				   {
					  
					if(file.listFiles().length!=0)
					{
					   File[] files = file.listFiles();
						 String fileName=null;
						
						 for(File f: files)
					     {
					    	// fileName[i]=f.getName();
					    	 System.out.println(f.getName());
					    	 File file1=new File("/home/bridgelabz/address/"+f.getName());
					    	 System.out.println("length="+file1.length()+" "+f.getName());
					    	 if(file1.length()==0)
					    		 fileName=f.getName();
					    	
					     }
						 System.out.println("u want to save previous modification done by open");
						 check=scanner.next();
						 if(check.equals("yes") & addressBookName!=null)
							 FileWriteAndRead.fileWrite(personList, "/home/bridgelabz/address/"+addressBookName);
						System.out.println("u want to save the previous file yes/no");
						check=scanner.next();
						if(check.equals("yes"))
						{
							System.out.println(fileName);

							addressBookManagerImplementation.saveAddressBook(arrayList,"/home/bridgelabz/address/"+fileName);
							arrayList=addressBookManagerImplementation.createNewAddressBook(path);

							try {
								FileWriter fileWriter=new FileWriter(path);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
						else
						{
							arrayList=addressBookManagerImplementation.createNewAddressBook(path);
							
							try {
								FileWriter fileWriter=new FileWriter(path);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							
							/*if(count==0)
							{	
							try {
								FileWriter fileWriter=new FileWriter(path);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							}
							else
							{
								
							}
							System.out.println(fileName);
							addressBookManagerImplementation.saveAddressBook(arrayList,"/home/bridgelabz/address/"+fileName);*/
						}
					}
				   }
				   break;
			case 2:
				
				if(file.listFiles().length!=0)
				{
				   File[] files = file.listFiles();
					 String fileName=null;
					
					 for(File f: files)
				     {
				    	// fileName[i]=f.getName();
				    	 System.out.println(f.getName());
				    	 File file1=new File("/home/bridgelabz/address/"+f.getName());
				    //	 System.out.println("length="+file1.length()+" "+f.getName());
				    	 if(file1.length()==0)
				    		 fileName=f.getName();
				    	
				     }
					 System.out.println("u want to save the previous file yes/no");
						check=scanner.next();
						if(check.equals("yes"))
						{
							System.out.println(fileName);

							addressBookManagerImplementation.saveAddressBook(arrayList,"/home/bridgelabz/address/"+fileName);
						}
				}
				   System.out.println("open address book");
				   addressBookName=addressBookManagerImplementation.openAddressBook();
				   File out=new File("/home/bridgelabz/address/"+addressBookName);
				   if(out.length()!=0)
				   {
					personList=AddressBookManagerImplementation.openBook(addressBookName);   
				   personList=modifyPersonDetails(personList);
				   System.out.println("after modifing PersonList");
				   System.out.println(personList);
				   }
				   break;
			case 3:
					System.out.println("save address book");
					System.out.println("book is saved");
					break;
			case 4:
				   System.out.println("save as address book");
				   if(addressBookName!=null)
				   {
					   System.out.println("enter the file name");
					   String fileName=scanner.next();
					   FileWriteAndRead.fileWrite(personList, "/home/bridgelabz/address/"+fileName+".txt");
				   }
				   else
					   System.out.println("no address book are open");
				   break;
			case 5:
				   System.out.println("close address book");
				   if(file.listFiles().length!=0)
					{
					   File[] files = file.listFiles();
						 String fileName=null;
						
						 for(File f: files)
					     {
					    	// fileName[i]=f.getName();
					    	 System.out.println(f.getName());
					    	 File file1=new File("/home/bridgelabz/address/"+f.getName());
					    //	 System.out.println("length="+file1.length()+" "+f.getName());
					    	 if(file1.length()==0)
					    		 fileName=f.getName();
					    	
					     }
						 System.out.println("u want to save the previous file yes/no");
							check=scanner.next();
							if(check.equals("yes"))
							{
								System.out.println(fileName);

								addressBookManagerImplementation.saveAddressBook(arrayList,"/home/bridgelabz/address/"+fileName);
							}
					}
				   System.out.println("u want to save previous modification done by open");
					 check=scanner.next();
					 if(check.equals("yes") & addressBookName!=null)
						 FileWriteAndRead.fileWrite(personList, "/home/bridgelabz/address/"+addressBookName);
				   if(addressBookName!=null)
				   {
					   FileReader fileReader;
					try {
						fileReader = new FileReader("/home/bridgelabz/address/"+addressBookName);
						System.out.println("the "+addressBookName+" is closed");
						addressBookName=null;
						fileReader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					   
				   }
				   else
				   
					   System.out.println("there is no book is currently open");
				   		System.exit(0);
				    
				  
			
					
			}
		}while(choice<6);
		scanner.close();
	}
	
	  static List<Person> modifyPersonDetails(List<Person> personList)
	{
		int choice;
		AddressBookImplementation addressBookImplementation=new AddressBookImplementation();
		
		do
		{
			System.out.println("MODIFYING     ADDRESS    BOOK    PERSON   DETAILS");
			System.out.println("-------------------------------------------------");
			System.out.println("\n1.add the person in the addressbook \n2.edit the existing person \n3.delete the person in address book \n4sort bi zipCode \n5.exit");
			System.out.println("enter ur choice");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
					
				   System.out.println("add new Person");
				   System.out.println(personList);
				   List<Person> addList=addressBookImplementation.addNewPerson();
				  // personList.addAll(personList);
				   personList.addAll(addList);
				   System.out.println("after adding new person");
				   System.out.println(personList);
				   break;
			case 2:
				   System.out.println("edit the existing one");
				   personList=addressBookImplementation.editExistingPerson(personList);
				   System.out.println("after edit");
				   System.out.println(personList);
				   break;
			case 3:
					System.out.println("delete the person");
					personList=addressBookImplementation.deletePersonInAddressBook(personList);
					System.out.println("after delete");
					System.out.println(personList);
					break;
			case 4:
					System.out.println("sort by zip Code");
					addressBookImplementation.sortByZipcode(personList);
					break;
			case 5:
				   return personList;
				   
			}
		}while(choice<5);
		return personList;
	}


}
