package com.objectorientedprograms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Vegetable 
{
public static void main(String[] args) 
{
	
	Scanner scanner=new Scanner(System.in);
	String check;
	do
	{
	DataManagement dataManagement=new DataManagement();
	System.out.println("enter the name of the vegetable");
	dataManagement.setName(scanner.next());
	System.out.println("enter the price per kg ");
	long priceKg=scanner.nextLong();
	dataManagement.setPricePerKg(priceKg);
	System.out.println("enter the weight");
	long weight=scanner.nextLong();
	dataManagement.setWeight(weight);
	dataManagement.setTotalAmount(weight*priceKg);
	filewrite(dataManagement);	
	System.out.println("do u want to add another one yes/no");
    check=scanner.next();
	}while(check.equals("yes"));
	scanner.close();

}
private static void filewrite(DataManagement dataManagement) 
{
	ObjectMapper mapper=new ObjectMapper();
	String json="[";
	JSONParser parser=new JSONParser();
	try {
			File file=new File("/home/bridgelabz/stock/datamanagement.json");
			
			if(file.length()==0)
			{
					
	        		 json=json+mapper.writeValueAsString(dataManagement)+"]";
			}
			else
			{
				Object object = parser.parse(new FileReader("/home/bridgelabz/stock/datamanagement.json"));
				JSONArray array=new JSONArray();
				array=(JSONArray) object;
				for (int j = 0; j < array.size(); j++) {
					json=json+array.get(j)+",";
				}
				json=json+mapper.writeValueAsString(dataManagement)+"]";
			}
			
		}

			catch (IOException e1) {
					e1.printStackTrace();
			}
			catch (ParseException e) {

					e.printStackTrace();
			}
	 try  {
		 	FileWriter file = new FileWriter("/home/bridgelabz/stock/datamanagement.json");
		 	file.write(json);
		 	file.flush();
	 		}
	 catch (IOException e) {
	        e.printStackTrace();
	    }
	 
}
}