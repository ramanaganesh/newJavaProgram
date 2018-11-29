package com.controller;

import java.util.Scanner;

import com.repository.Repository;
import com.repository.RepositoryImplementation;
import com.service.Service;
import com.service.ServiceImplementation;

public class MainRunner 
{
	public static void main(String[] args) 
	{
		Service service=new ServiceImplementation();
		Repository repository=new RepositoryImplementation(); 
		Scanner scanner=new Scanner(System.in);
		int choice;
		String check=null;
		boolean flag=service.check();
		if(flag==true)
		{
			System.out.println("connected successfully");
			do
			{
			System.out.println("\n1.insert \n2.update \n3.delete \n4.display");
			System.out.println("enter ur choice");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
					System.out.println("insert");
					repository.insert();
					break;
			case 2:
					System.out.println("update");
					repository.update();
					break;
			case 3:
					System.out.println("delete");
					repository.delete();
					break;
			case 4:
					System.out.println("display");
					repository.display();
					break;
			
			}
			System.out.println("do u want to continue yes/no");
			check=scanner.next();
			}while(check.equals("yes"));
		}
	}
}
