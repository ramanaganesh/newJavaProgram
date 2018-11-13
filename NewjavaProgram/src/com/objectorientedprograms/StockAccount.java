package com.objectorientedprograms;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockAccount 
{
	 Scanner scanner=new Scanner(System.in);
	Object object,object1[];
	JSONArray obj=new JSONArray();
	JSONObject jsonObject[];
	static long price[];
	 static JSONObject name[];
	 static String companySymbol[];
	 static JSONParser parser =new JSONParser();
	public StockAccount(int count)
	{	
		CustomerForStock c=new CustomerForStock();
		System.out.println("enter ur id");
		c.setId(scanner.nextInt());
		System.out.println("enter ur name");
		c.setName(scanner.next());
		System.out.println("enter ur phone number");
		c.setNum(scanner.next());
		ObjectMapper mapper=new ObjectMapper();
		String json="[";
		try {
				if(count==0)
				{
		        		 json=json+mapper.writeValueAsString(c)+"]";
				}
				else
				{
					Object obj = parser.parse(new FileReader("/home/bridgelabz/customerdetails.json"));
					JSONArray array=new JSONArray();
					array=(JSONArray) obj;
					
					for (int i = 0; i < count; i++)
					{
						
						if(i==0)
							json=json+array.get(i)+",";
						else
							json=json+array.get(i)+",";
					}
						json=json+mapper.writeValueAsString(c)+"]";
					/*if(count==1)
					{
						Object obj = parser.parse(new FileReader("/home/bridgelabz/customerdetails.json"));
						JSONObject jsonObject=new JSONObject();
						jsonObject=(JSONObject) obj;
						json="["+obj+",";
						json=json+mapper.writeValueAsString(c)+"]";
					}
					else
					{
						Object obj = parser.parse(new FileReader("/home/bridgelabz/customerdetails.json"));
						JSONArray array=new JSONArray();
						array=(JSONArray) obj;
						
						System.out.println("ARRAy"+array);

					}*/
				}}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try (FileWriter file = new FileWriter("/home/bridgelabz/customerdetails.json")) {

	            file.write(json);
	            System.out.println();
	            System.out.println("successfully added");
	            file.flush();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
   /* double valueOf()
    {
    	 try {
			object = Customer.parser.parse(new FileReader("/home/bridgelabz/stocklist.json"));
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 		double totalValue=0;
    			obj=(JSONArray) object;
		
    			object1=new Object[obj.size()];
    			jsonObject=new JSONObject[obj.size()];
    			name=new JSONObject[obj.size()];
    			price=new long[obj.size()];
    	for (int i = 0; i < obj.size(); i++) 
    	{
    		object1[i]=obj.get(i);
    		jsonObject[i]=(JSONObject) object1[i];
    		name[i] = (JSONObject) jsonObject[i].get("Stock");
			price[i]=(long)name[i].get("TotalAmount");
			totalValue=totalValue+price[i];
		}
    	System.out.println(totalValue);
    	
    	return totalValue*0.013771; 
    }*/
    static void buy(int amount,String symbol)
    {
    	Object obj;
		try {
				obj = parser.parse(new FileReader("/home/bridgelabz/stockmaintain.json"));
				JSONArray array=new JSONArray();
				array=(JSONArray) obj;
				Object object[]=new Object[array.size()];
	 	           
	            JSONObject jsonObject[]=new JSONObject[array.size()];
	            companySymbol=new String[array.size()];
	            name=new JSONObject[array.size()];
	            int i=1;
	    		for (int j = 0; j < array.size(); j++)
	    		{
	    		//	System.out.println(array.get(j));
	    			object[j]=array.get(j);

					jsonObject[j]=(JSONObject) object[j];
				//	System.out.println(jsonObject[j]);
					String n="Stock"+i;
					System.out.println(n);
					name[j] = (JSONObject) jsonObject[j].get(n);
					i++;
					companySymbol[j]=(String)name[j].get("StockSymbol");
	    		}
	    		 
			} 
		catch (IOException | ParseException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for (int j = 0; j < companySymbol.length; j++) 
		  {
			  if(companySymbol[j].equals(symbol))
			  {
				  Long share=(Long)name[j].get("NumberOfShare");
				  Long price=(Long)name[j].get("SharePrice");
				  share=share+amount;
				  name[j].put("NumberOfShare",share);
				  name[j].put("TotalAmount",(share*price));
			  }
		  }
		JSONArray obj2=new JSONArray();
        JSONObject o=new JSONObject();
        Map<Object, Object> m=new HashMap<>();
       int  i=1;
		 for (int j = 0; j < name.length; j++) {
			 //System.out.println(name[j]);
				String n="Stock"+i;
				i++;
			 m.put(n,name[j]);
			 
		 }
		 o.putAll(m);
		 obj2.add(o);
		 System.out.println(obj2);
		 FileWriter(obj2);
    }
private static void FileWriter(JSONArray obj2)
	{
	 try (FileWriter file = new FileWriter("/home/bridgelabz/stockmaintain1.json")) {

         file.write(obj2.toJSONString());
         System.out.println();
         System.out.println("successfully added");
         

     } catch (IOException e) {
         e.printStackTrace();
     }
	}
}