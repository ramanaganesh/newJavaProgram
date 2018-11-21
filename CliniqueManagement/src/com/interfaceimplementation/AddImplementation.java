package com.interfaceimplementation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

import com.models.Patient;

public class AddImplementation  implements Add
{
	Scanner scanner=new Scanner(System.in);
	List<Patient> patientList=new ArrayList<>();
	@Override
	public void addingPatientDetail() 
	{
		int choice;
		do
		{
			System.out.println("\n1.add \n2.edit \n3.delete \n4.exit");
			System.out.println("enter ur choice");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
					System.out.println("add the patient");
					patientList=addPatient();
					break;
			case 2:
					System.out.println("edit the patient");
					patientList=editPatient(patientList);
					break;
			case 3:
					System.out.println("delete the patient");
					patientList=deletePatient(patientList);
					break;
			case 4:
				    System.out.println("before exit u want to save the patient detail yes/no");
				    String check=scanner.next();
				    if(check.equals("yes"))
				    	savePatientDetail(patientList);
					System.exit(0);
			
			}
		}while(choice<5);
    	
	}

	private List<Patient> deletePatient(List<Patient> patientList) 
	{
		if(patientList.isEmpty())
		{
			System.out.println("there is no content in the file to delete");
		}
		else
		{
			System.out.println("which patient u want to delete");
			for (int i = 0; i < patientList.size(); i++) 
			{
				System.out.println(patientList.get(i));
			}
			int id=scanner.nextInt();
			for (int i = 0; i < patientList.size(); i++) 
			{
				if(id==patientList.get(i).getId())
				{
					patientList.remove(i);
				}
			}	
		}
		return patientList;
	}
	private List<Patient> editPatient(List<Patient> patientList)
	{
		
		if(patientList.isEmpty())
		{
			System.out.println("there is no content in the file");
		}
		else
		{
			System.out.println("which patient u want to edit");
			for (int i = 0; i < patientList.size(); i++) 
			{
				System.out.println(patientList.get(i));
			}
			int id=scanner.nextInt();
			for (int i = 0; i < patientList.size(); i++) 
			{
				if(id==patientList.get(i).getId())
				{
					System.out.println("Enter the name again");
					String name=scanner.next();
					patientList.get(i).setName(name);
					System.out.println("enter the number");
					String number=scanner.next();
					patientList.get(i).setPhoneNumber(number);
				}
			}
		}
		System.out.println(patientList);
		return patientList;
	}

	@Override
	public void addingDoctorDetail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fixingAppointmentForPatient() {
		// TODO Auto-generated method stub
		
	}
	List<Patient> addPatient()
	{
		String check;
		do
		{
    		Patient patient=new Patient();
    		System.out.println("enter ur name");
    		String patientName=scanner.next();
    		patient.setName(patientName);
    		System.out.println("enter the id");
    		int id=scanner.nextInt();
    		patient.setId(id);
    		System.out.println("enter the phone Number");
    		String phoneNumber=scanner.next();
    		patient.setPhoneNumber(phoneNumber);
    		System.out.println("enter the age");
    		int age=scanner.nextInt();
    		patient.setId(age);
    		patientList.add(patient);
    		System.out.println("do u want to add another person yes/no");
    		check=scanner.next();
    		
		}while(check.equals("yes"));
		System.out.println(patientList);
		return patientList;
	}

	@Override
	public void savePatientDetail(List<Patient> patientList) 
	{
		
		 String json="[";
		 ObjectMapper mapper=new ObjectMapper();
			try {
				
				int temp=0;
				for (int i = 0; i < patientList.size()-1; i++)
				{
					temp=i;
					json=json+mapper.writeValueAsString(patientList.get(i))+",";
				}
				if(patientList.size()>1)
					json=json+mapper.writeValueAsString(patientList.get(temp+1))+"]";
				if(patientList.size()==1)
					json=json+mapper.writeValueAsString(patientList.get(patientList.size()-1))+"]";
				FileWriter fileWriter=new FileWriter("/home/bridgelabz/clinique/patientdetails.json");
				fileWriter.write(json);
				fileWriter.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	

	}
}
