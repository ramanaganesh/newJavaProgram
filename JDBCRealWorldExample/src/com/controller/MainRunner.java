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
		System.out.println("BOOK    MY    SHOW");
		System.out.println("-------------------");
		System.out.println("LOGGING   REGISTER");
		System.out.println("------------------");
		boolean flag=service.check();String temp;
		if(flag)
		{
			System.out.println("connected successfully");
			System.out.println("register some user for login verification yes/no");
			String loginCheck=scanner.next();
			if(loginCheck.equals("yes"))
					repository.registerForLogin();
			System.out.println("PASSWORD      VALIDATION");
			System.out.println("------------------------");
			System.out.println("login process");
			boolean check=repository.loginVerification();
			int count=3;
			while(!check && count>0)
			{
				System.out.println("re-enter the correct username and password and "+(--count)+" times left");
				
				check=repository.loginVerification();
			}
			if(check)
			{
			System.out.println("login successfully");
			
			do
			{
				System.out.println("List of crud operation");
				System.out.println("----------------------");
				System.out.println("\n1.insert show in book my show \n2.update the screen details \n3.delete the film \n4.display the film details");
				choice=scanner.nextInt();
				switch(choice)
				{
				case 1:
						System.out.println("inserting show");
						System.out.println("--------------");
						repository.insertShowDetails();
						break;
				case 2:
						System.out.println("update the screen details and booking status ");
						System.out.println("---------------------------------------------");
						repository.updateDetails();
						break;
				case 3:
						System.out.println("delete the film from book my show");
						System.out.println("---------------------------------");
						repository.deleteFilm();
						break;
				case 4:
						System.out.println("displaying show list to the user");
						System.out.println("--------------------------------");
						repository.displayShowList();
						break;
				}
				System.out.println("do u want continue crud operaration yes/no");
				temp=scanner.next();
			}while(temp.equals("yes"));
			}
			else
			{
				System.out.println("timed out");
			}

		}
		else
			System.out.println("not connected");
	}
}
