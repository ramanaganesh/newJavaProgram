package com.cliniquemanagementprogram;

import java.util.Scanner;

import com.interfaceimplementation.AddImplementation;

public class CliniqueManagemementProgramme 
{
	
	public static void main(String[] args) 
	{
		AddImplementation addImplementation=new AddImplementation();
		Scanner scanner=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("enter ur choice");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				   System.out.println("Registration detail");
				   addImplementation.addingPatientDetail();
				   break;
			case 2:
					System.out.println("search details");
					break;
			case 3:
					System.out.println("display detail");
					break;
			}
		}while(choice<4);
			
		
	}
}
