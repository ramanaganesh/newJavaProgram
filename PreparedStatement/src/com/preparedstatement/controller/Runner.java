package com.preparedstatement.controller;

import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;
import com.preparedstatement.repository.Repository;
import com.preparedstatement.repository.RepositoryImplementation;
import com.preparedstatement.service.Service;
import com.preparedstatement.service.ServiceImplementation;

public class Runner 
{
public static void main(String[] args) 
{
	Scanner scanner=new Scanner(System.in);
	Service service=new ServiceImplementation();
	Repository repository=new RepositoryImplementation();
	String name,department;
	boolean check=service.check();String check1=null;
	if(check==true)
	{
		System.out.println("connected successfully");
		do
		{
			System.out.println("\n1.insert \n2.update \n3.delete \n4.display");
			System.out.println("enter ur choice");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
					System.out.println("insert");
					System.out.println("enter the name");
					name=scanner.next();
					System.out.println("enter the department");
					department=scanner.next();
					repository.insert(name,department);
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
			System.out.println("continue yes/no");
			check1=scanner.next();
		}while(check1.equals("yes"));
	}
}
}
