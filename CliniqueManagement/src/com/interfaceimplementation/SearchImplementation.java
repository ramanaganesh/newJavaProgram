package com.interfaceimplementation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.models.Appointment;
import com.models.Doctor;
import com.models.Patient;

public class SearchImplementation implements Search
{
Map<Object,Object> doctorPopular=new HashMap<>(); 
	@Override
	public Patient patientSearchByName(List<Patient> patientList,int id)
	{
		for (int i = 0; i < patientList.size(); i++)
		{
			if(id==patientList.get(i).getId())
			{
				
					return patientList.get(i);
				}
				
			}
		return null;
	}

	@Override
	public Patient patientSearchById(List<Patient> patientList,int patientId) 
	{
		for (int i = 0; i < patientList.size(); i++)
		{
			if(patientId==patientList.get(i).getId())
			{
				
					return patientList.get(i);
				}
				
			}
		
	return null;	
	}	
		
	

	@Override
	public Patient patientSearchByPhoneNumber(List<Patient> patientList,int id) {
		for (int i = 0; i < patientList.size(); i++)
		{
			if(id==patientList.get(i).getId())
			{
				
					return patientList.get(i);
				}
				
			}
		return null;
	}

	@Override
	public Doctor doctorSearchByName(List<Doctor> doctorList,int id) {
		for (int i = 0; i < doctorList.size(); i++)
		{
			if(id==doctorList.get(i).getId())
			{
				
					return doctorList.get(i);
				}
				
			}
		return null;
		
	}

	@Override
	public Doctor doctorSearchById(List<Doctor> doctorList,int id) {
		for (int i = 0; i < doctorList.size(); i++)
		{
			if(id==doctorList.get(i).getId())
			{
				
					return doctorList.get(i);
				}
				
			}
		return null;		
	}

	@Override
	public Doctor doctorSearchBySpecialist(List<Doctor> doctorList,int id) {
		for (int i = 0; i < doctorList.size(); i++)
		{
			if(id==doctorList.get(i).getId())
			{
				
					return doctorList.get(i);
				}
				
			}
		return null;
		
	}

	@Override
	public Doctor doctorSearchByAvailability(List<Doctor> doctorList,int id) 
	{
		Doctor doctor=null;
		for (int i = 0; i < doctorList.size(); i++)
		{
			if(id==doctorList.get(i).getId())
			{
				if(doctorList.get(i).getNumberOfPatient()<6)
				{
					System.out.println("size="+doctorList.get(i).getNumberOfPatient());
					System.out.println(doctorList.get(i).getNumberOfPatient());
					int count=doctorList.get(i).getNumberOfPatient();
					
					doctorList.get(i).setNumberOfPatient(++count);
					System.out.println(doctorList.get(i));
					AddImplementation addImplementation=new AddImplementation();
					addImplementation.saveDoctorDetail(doctorList);
					doctor= doctorList.get(i);
				}
				else
				{
					System.out.println("doctor is not availability ");
					return null;
				}
			}
		}
	return doctor;	
	}

	@Override
	public void specialist()
	{
		ObjectMapper mapper=new ObjectMapper();
		List<Doctor> listDoctor=new ArrayList<>();
		try {
			listDoctor.addAll(mapper.readValue(new File("/home/bridgelabz/clinique/doctordetails.json"), new TypeReference<List<Doctor>>() {
			}));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			for (int i = 0; i < listDoctor.size(); i++) 
			{
				if(doctorPopular.isEmpty())
					doctorPopular.put(listDoctor.get(i).getSpecialization(),listDoctor.get(i).getNumberOfPatient());
				else
				{
					int value=0;
					if(doctorPopular.containsKey(listDoctor.get(i).getSpecialization()))
					{
						value=value+(int)doctorPopular.get(listDoctor.get(i).getSpecialization())+(int)listDoctor.get(i).getNumberOfPatient();
						doctorPopular.put(listDoctor.get(i).getSpecialization(), value);
					}
					else
					{
						doctorPopular.put(listDoctor.get(i).getSpecialization(),listDoctor.get(i).getNumberOfPatient());

					}
				}
				
			}
			Map.Entry<Object,Object> firstEntry = doctorPopular.entrySet().iterator().next();
			String largestKey = (String)firstEntry.getKey();
			int largestKeyValue =(int) firstEntry.getValue();
		 
			for (Map.Entry<Object, Object> map :doctorPopular.entrySet()) {
			    int key = (int)map.getValue();
			    if (key > largestKeyValue) {
				largestKeyValue = key;
				largestKey = (String)map.getKey();
			    }
			}
			System.out.println("specialoization: " + largestKey);
			System.out.println("Number of patients: " + largestKeyValue);
		    
			
		} /*catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	
	@Override
	public void popularDoctor() {
		ObjectMapper mapper=new ObjectMapper();
		List<Appointment> appointments=new ArrayList<>();
		List<Doctor> listDoctor=new ArrayList<>();
		try {
			/*appointments.addAll(mapper.readValue(new File("/home/bridgelabz/clinique/appointment.json"), new TypeReference<List<Doctor>>() {
			}));*/
			listDoctor.addAll(mapper.readValue(new File("/home/bridgelabz/clinique/doctordetails.json"), new TypeReference<List<Doctor>>() {
			}));
			System.out.print("the popular doctor is ");
			int big=0;
			String specialist=null,doctorName=null;;
			for (int i = 0; i < listDoctor.size(); i++) 
			{
				for (int j = 0; j < listDoctor.size(); j++)
				{
					
					if(listDoctor.get(i).getNumberOfPatient()>listDoctor.get(j).getNumberOfPatient())
					{
						big=listDoctor.get(i).getNumberOfPatient();
						specialist=listDoctor.get(i).getSpecialization();
						doctorName=listDoctor.get(i).getName();
					}
				}
			}
			System.out.println(doctorName+" more specialization in "+specialist+" and number of patient he attended is "+big);
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
	

	

}
	}
