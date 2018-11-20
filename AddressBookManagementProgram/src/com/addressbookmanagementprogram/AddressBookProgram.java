package com.addressbookmanagementprogram;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import com.intefaceimplementation.AddressBookManagerImplementation;
import com.utility.FileWriteAndRead;

public class AddressBookProgram 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		int choice;String name,path,check;
		ArrayList<Object> arrayList=new ArrayList<>();
		do
		{
				System.out.println("enter ur choice");
				choice=scanner.nextInt();
				AddressBookManagerImplementation addressBookManagerImplementation=new AddressBookManagerImplementation();

			switch (choice) {
			case 1:
				   System.out.println("create new address book");
				   File file=new File("/home/bridgelabz/address/");
				   System.out.println("enter the file name");
					name=scanner.next();
					path="/home/bridgelabz/address/"+name+".json";
					System.out.println("length="+file.listFiles().length);
				   if(file.listFiles().length==0)
				     arrayList=addressBookManagerImplementation.createNewAddressBook(path);
				   else
				   {
					  
					if(file.listFiles().length!=0)
					{
					   File[] files = file.listFiles();
						 String fileName=null;
						 int i=0;
						 for(File f: files)
					     {
					    	// fileName[i]=f.getName();
					    	 System.out.println(f.getName());
					    	 File file1=new File("/home/bridgelabz/address/"+f.getName());
					    	 System.out.println("length="+file1.length()+" "+f.getName());
					    	 if(file1.length()==0)
					    		 fileName=f.getName();
					    	 i++;
					     }
						 
						System.out.println("u want to save the previous file yes/no");
						check=scanner.next();
						if(check.equals("yes"))
						{
							System.out.println(fileName);

							addressBookManagerImplementation.saveAddressBook(arrayList,"/home/bridgelabz/address/"+fileName);
							arrayList=addressBookManagerImplementation.createNewAddressBook(path);
						}
						else
						{
							arrayList=addressBookManagerImplementation.createNewAddressBook(path);
							System.out.println(fileName);
							addressBookManagerImplementation.saveAddressBook(arrayList,"/home/bridgelabz/address/"+fileName);
						}
					}
				   }
				   break;
			case 2:
				   System.out.println("open address book");
				   addressBookManagerImplementation.openAddressBook();
				   break;
			case 3:
				   System.out.println("save address book");
				   break;
			case 4:
				   System.out.println("save as address book");
				   break;
			case 5:
				   System.out.println("close address book");
				   break;
			default:
					System.exit(0);
					
			}
		}while(choice!=6);
		scanner.close();
	}


}
