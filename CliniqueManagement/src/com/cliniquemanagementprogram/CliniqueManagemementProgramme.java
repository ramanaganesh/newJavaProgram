package com.cliniquemanagementprogram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.interfaceimplementation.AddImplementation;
import com.interfaceimplementation.SearchImplementation;
import com.models.Doctor;
import com.models.Patient;

public class CliniqueManagemementProgramme 
{
	static Scanner scanner=new Scanner(System.in);
	static int choice;
	static String flag;
	static List<Patient> patientList=new ArrayList<>();
	static List<Doctor> doctorList=new ArrayList<>();
	static AddImplementation addImplementation=new AddImplementation();
	static SearchImplementation searchImplementation=new SearchImplementation();
	static ObjectMapper mapper=new ObjectMapper();
	public static void main(String[] args) 
	{
		
		do
		{
			System.out.println("\n1.registration \n2.search \n3.display \n4.close");
			System.out.println("enter ur choice");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				   System.out.println("Registration detail");
				   registrationCall();
				   
				 //  addImplementation.addingPatientDetail();
				   break;
			case 2:
					System.out.println("search details");
					searchCall();
					break;
			case 3:
					System.out.println("display detail");
					break;
			case 4:
					System.out.println("close ");
					
					break;
			}
		}while(choice<4);
			
	}
	static void registrationCall()
	{
		int innerChoice,subChoice,innerChoice2;
		do
		{
			System.out.println("1.register patient \n2.register doctor \n3.fixing appointement \n4.exit");
			System.out.println("enter ur choice");
			subChoice=scanner.nextInt();
			switch (subChoice) 
			{
			case 1:
					do
					{
					System.out.println("registering patient details");
					System.out.println("1.add patient \n2.edit patient \n3.delete patient \n4.save  \n5.exit");
					innerChoice=scanner.nextInt();
					switch (innerChoice)
					{
					case 1:
							System.out.println("add patient");
							patientList=addImplementation.addPatientDetail();
							System.out.println("after add");
							System.out.println(patientList);
							break;
					case 2:
							System.out.println("edit patient");
							patientList=addImplementation.editPatientDetail(patientList);
							System.out.println("after edit");
							System.out.println(patientList);
							break;
					case 3:
							System.out.println("delete patient");
							patientList=addImplementation.deletePatientDetail(patientList);
							System.out.println("after delete");
							System.out.println(patientList);
							break;
					case 4:
							System.out.println("before exit u eant to save the patient detail or yes/no");
							flag=scanner.next();
							System.out.println("before save");
							System.out.println(patientList);
							if(flag.equals("yes"))
								addImplementation.savePatientDetail(patientList);
							break;
					case 5:
							System.out.println("exit");
							break;
					}
					}while(innerChoice<5);
					break;
			case 2:
				
				do
				{
					System.out.println("registering doctor details");
					System.out.println("1.add doctor \n2.edit doctor \n3.delete doctor \n4.save  \n5.exit");
					innerChoice2=scanner.nextInt();	
				
				switch (innerChoice2)
				{
				case 1:
						System.out.println("add doctor");
						doctorList=addImplementation.addDoctorDetail();
						System.out.println("after add");
						System.out.println(doctorList);
						break;
				case 2:
						System.out.println("edit doctor");
						doctorList=addImplementation.editDoctorDetail(doctorList);
						System.out.println("after edit");
						System.out.println(doctorList);
						break;
				case 3:
						System.out.println("delete doctor");
						doctorList=addImplementation.deleteDoctorDetail(doctorList);
						System.out.println("after delete");
						System.out.println(doctorList);
						break;
				case 4:
						System.out.println("before exit u eant to save the patient detail yes/no");
						flag=scanner.next();
						System.out.println("before save");
						System.out.println(doctorList);
						if(flag.equals("yes"))
							addImplementation.saveDoctorDetail(doctorList);
						break;
				case 5:
					System.out.println("exit");
					break;		
				
				}
				}while(innerChoice2<5);
				break;	
			case 3:
					System.out.println("fixing appointment for patient");
					List<Patient> patientFullList=new ArrayList<>();
					List<Doctor> doctorFullList=new ArrayList<>();
					try {
						patientList.addAll(mapper.readValue(new File("/home/bridgelabz/clinique/patientdetails.json"), new TypeReference<List<Patient>>() {
						}));
						doctorList.addAll(mapper.readValue(new File("/home/bridgelabz/clinique/doctordetails.json"), new TypeReference<List<Doctor>>() {
						}));
						System.out.println("the doctors in the clinique ");
						for (int i = 0; i < doctorList.size(); i++)
						{
							System.out.println(doctorList.get(i));
						}
						System.out.println("the patient are ");
						for (int i = 0; i < patientList.size(); i++)
						{
							System.out.println(patientList.get(i));
						}
						System.out.println("enter the patient id");
						int patientId=scanner.nextInt();
						System.out.println("enter the doctor id");
						int doctorId=scanner.nextInt();
						Doctor doctor=searchImplementation.doctorSearchByAvailability(doctorList,doctorId);
						Patient patient=searchImplementation.patientSearchById(patientList,patientId);
						if(doctor==null)
							System.out.println("fix another date");
						else
						addImplementation.fixingAppointmentForPatient(doctor,patient);
					} catch (JsonParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (JsonMappingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			case 4:
					System.out.println("exit from sub menu");
					break;
			}
		}while(subChoice<4);
	}
	private static void searchCall() {
		int subChoice,innerSubchoice;
		List<Patient> patientFullList=new ArrayList<>();
		List<Doctor> doctorFullList=new ArrayList<>();
		try {
			patientList.addAll(mapper.readValue(new File("/home/bridgelabz/clinique/patientdetails.json"), new TypeReference<List<Patient>>() {
			}));
			doctorList.addAll(mapper.readValue(new File("/home/bridgelabz/clinique/doctordetails.json"), new TypeReference<List<Doctor>>() {
			}));
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("enter the patient id for search");
		int patientId=scanner.nextInt();
		System.out.println("enter the doctor id for search");
		int doctorId=scanner.nextInt();
	do 
	{
	System.out.println("\n1.search by patient \n2.search by doctor \n3search by  specialist \n4.search by popular doctor \n5.exit");
	subChoice=scanner.nextInt();
	switch(subChoice)
	{
	case 1:
		do
		{
			System.out.println("\n1.search by name \n2.search by id \n3.search by phone number \n4.exit");
			innerSubchoice=scanner.nextInt();
			switch(innerSubchoice)
			{
			case 1:
					System.out.println("search by name");
					searchImplementation.patientSearchByName(patientList,patientId);
					break;
			case 2:
				System.out.println("search by id");
				searchImplementation.patientSearchById(patientList,patientId);
				break;
			case 3:
				System.out.println("search by name");
				searchImplementation.patientSearchByPhoneNumber(patientList,patientId);
				break;
			
			case 4:
					System.out.println("exit");
					break;
			}
		}while(innerSubchoice<4);
	case 2:
		do
		{
			System.out.println("\n1.search by name \n2.search by id \n3.search by specialization \n4.search by availability \n5.exit");
			innerSubchoice=scanner.nextInt();
			switch(innerSubchoice)
			{
			case 1:
					System.out.println("search by name");
					searchImplementation.doctorSearchByName(doctorList,doctorId);
					break;
			case 2:
				System.out.println("search by id");
				searchImplementation.doctorSearchById(doctorList,doctorId);
				break;
			case 3:
				System.out.println("search by name");
				searchImplementation.doctorSearchBySpecialist(doctorList,doctorId);
				break;
			case 4:
				System.out.println("search by name");
				searchImplementation.doctorSearchByAvailability(doctorList,doctorId);	
				break;
			case 5:
					System.out.println("exit");
					break;
			}
		}while(innerSubchoice<5);
	case 3:
			System.out.println("specialist");
			searchImplementation.specialist();
			break;
	case 4:
		System.out.println("popular doctor");
		searchImplementation.popularDoctor();
		break;		
	case 5:
		   System.out.println("exit");
		   break;
	}
	}while(subChoice<5);
	}
}
