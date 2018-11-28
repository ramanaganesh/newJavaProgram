package com.statement.controller;


import java.util.Scanner;

import com.statement.models.CompanyEmployeeDetails;
import com.statement.repository.Repository;
import com.statement.repository.RepositoryImplementation;
import com.statement.services.Service;
import com.statement.services.ServiceImplementation;

public class Runner 
{
public static void main(String[] args)
{

	Scanner scanner=new Scanner(System.in);
	String check;
	int choice;
	Service  serviceimpl=new ServiceImplementation();
	Repository repository=new RepositoryImplementation();		
	
	do
	{
		CompanyEmployeeDetails employeeDetails=new CompanyEmployeeDetails();

		
		
	//	employeelist.add(employeeDetails);
		try {
			boolean b=serviceimpl.change();
			if(b==true)
			{
				System.out.println("successfully connected ");
				System.out.println("\n1.insert \n2.update \n3.delete \n4.display");
				choice=scanner.nextInt();
				switch(choice)
				{
				case 1:
						System.out.println("enter the salary");
						int salary=scanner.nextInt();
						employeeDetails.setSalary(salary);
						System.out.println("enter the name");
						String name=scanner.next();
						employeeDetails.setName(name);
						repository.insert(employeeDetails);break;
				case 2:repository.update(employeeDetails);break;
				case 3:repository.delete(employeeDetails);break;
				case 4:repository.display(employeeDetails);break;
				default: break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("do u want to add more person");
		check=scanner.next();
	}while(check.equals("yes"));
	
	scanner.close();
}
}
