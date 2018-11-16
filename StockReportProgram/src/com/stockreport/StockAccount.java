package com.stockreport;


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
	static JSONParser parser=new JSONParser();
	static JSONObject name[];static long cId[];
	 static String companySymbol[];
	@SuppressWarnings("unchecked")
	public StockAccount() 
	{

    	Object obj,obj1,obj2,obje,obje1,obje2;
    	 JSONArray a=new JSONArray();
    	JSONObject object2=new JSONObject();
    	long value=0;
		try {
				obj = parser.parse(new FileReader("/home/bridgelabz/stock/stockinjson.json"));
				obj1 = parser.parse(new FileReader("/home/bridgelabz/stock/customerdetail.json"));
				
				JSONArray array1=new JSONArray();
				JSONArray array2=new JSONArray();
				array1=(JSONArray) obj1;
				
				JSONArray array=new JSONArray();
				obj2 = parser.parse(new FileReader("/home/bridgelabz/stock/customerproductdetail.json"));				
			array2=(JSONArray) obj2;
				array=(JSONArray) obj;
				
				Object object[]=new Object[array.size()];
				

	            JSONObject jsonObject[]=new JSONObject[array.size()];
	            JSONObject jsonObject1=new JSONObject();

	            cId=new long[array1.size()];
	            name=new JSONObject[array.size()];
	            int i=1;
	    		for (int j = 0; j < array.size() ; j++)
	    		{
	    	
	    			object[j]=array.get(j);
	    			
					jsonObject[j]=(JSONObject) object[j];
					
			
					String n="Stock"+i;
					
					name[j] = (JSONObject) jsonObject[j].get(n);
					System.out.println(name[j]);
					i++;
					
	    		}
	    		System.out.println(array1.size());
	    		for (int j = 0; j < array1.size(); j++) 
	    		{
	    			jsonObject1=(JSONObject) array1.get(j);
	    			cId[j]=(long) jsonObject1.get("id");
				}
	    		System.out.println("u want to \n1.buy \n2.sell");
	    		int choice=scanner.nextInt();
	    		/*System.out.println("the customers are:");
	    		for (int j = 0; j < cId.length; j++) 
	    		{
	    			System.out.println(cId[j]);
				}
	    		System.out.println("the stocks are");
	    		for (int j = 0; j < name.length; j++) 
	    		{
	    			System.out.println(name[j].get("StockName"));
				}
	    		System.out.println("enter the customer id"); 
	    		Long customerId=scanner.nextLong();
	    		System.out.println("enter the stock name");
	    		String Stockname=scanner.next();*/
	    		
	    		if(choice==1)
	    		{
	    			System.out.println("the customers are:");
		    		for (int j = 0; j < cId.length; j++) 
		    		{
		    			System.out.println(cId[j]);
					}
		    		System.out.println("the stocks are");
		    		for (int j = 0; j < name.length; j++) 
		    		{
		    			System.out.println(name[j].get("StockName"));
					}
		    		System.out.println("enter the customer id"); 
		    		Long customerId=scanner.nextLong();
		    		System.out.println("enter the stock name");
		    		String Stockname=scanner.next();
	    			System.out.println("enter the amount");
	    			int amount=scanner.nextInt();
	    			System.out.println("enter the stock symbol");
	    			String symbol=scanner.next();
	    			int temp=0,temp1=0;
	    			for (int j = 0; j < cId.length; j++) 
	    			{
	    				jsonObject1=(JSONObject) array1.get(j);
	    				if(customerId==(long) jsonObject1.get("id"))
	    							temp=j;
					}
	    			for (int j = 0; j < name.length; j++) 
	    			{
	    				
	    				if(name[j].get("StockName").equals(Stockname))
	    						temp1=j;
					}
		    		
	    			 while(amount>=(long)name[temp1].get("NumberOfShare"))
	    			 {
	    				 System.out.println("enter the valid amount");
	 	    			 amount=scanner.nextInt();
	    			 }
	    			value=(long)buy(amount,symbol);
	    			
	    			array2=(JSONArray) obj2;
	    			
	    			int count=0;
	    			for (int j = 0; j < cId.length; j++)
	    			{
	    				
	    				object2=(JSONObject) array2.get(j);
	    				a=(JSONArray)object2.get("productShare");
	    				//System.out.println(a.size());
	    			//	System.out.println(temp+" "+temp1);
	    				
	    				for (int j2 = 0; j2 <name.length; j2++)
	    				{
							
							if(j==temp && j2==temp1)
	    						{
	    							long value1=(long)a.get(temp1)+value;
	    						/*	System.out.println(value1);
	    							System.out.println(a.get(j2));*/
	    							a.set(j2,value1);
	    						}
						//	object2.put(a.get(j2),a.get(j2));
	    				}
	    				//System.out.println("object2="+object2+"COUNT="+count);
	    				JSONArray copy=new JSONArray();
	    				copy.add(object2);
	    				fileWriteForCustomerDetail(copy,count);
	    				count++;
	    			}
	    			
	    			}
	    		else
	    		{
	    			/*System.out.println("selling to stock ");
	    			obje = parser.parse(new FileReader("/home/bridgelabz/stock/stockinjson.json"));
					obje1 = parser.parse(new FileReader("/home/bridgelabz/stock/customerdetail.json"));
					
					JSONArray ary1=new JSONArray();
					JSONArray ary2=new JSONArray();
					ary1=(JSONArray) obje1;
					
					JSONArray ary=new JSONArray();
					obje2 = parser.parse(new FileReader("/home/bridgelabz/stock/customerproductdetail.json"));				
					ary2=(JSONArray) obje2;
					ary=(JSONArray) obje;
					Object object1[]=new Object[array.size()];
					

		            JSONObject jsonObject11[]=new JSONObject[array.size()];
		            JSONObject jsonObject12=new JSONObject();

		            cId=new long[array1.size()];
		            name=new JSONObject[array.size()];
		            int k=1;
		    		for (int j = 0; j < array.size() ; j++)
		    		{
		    	
		    			object1[j]=array.get(j);
		    			
						jsonObject11[j]=(JSONObject) object[j];
						
				
						String n="Stock"+k;
						
						name[j] = (JSONObject) jsonObject[j].get(n);
						System.out.println(name[j]);
						k++;
						
		    		}
		    		System.out.println(array1.size());
		    		for (int j = 0; j < array1.size(); j++) 
		    		{
		    			jsonObject1=(JSONObject) array1.get(j);
		    			cId[j]=(long) jsonObject1.get("id");
					}*/
	    			
		    		System.out.println("the customers are:");
		    		for (int j = 0; j < cId.length; j++) 
		    		{
		    			System.out.println(cId[j]);
					}
		    		System.out.println("the stocks are");
		    		for (int j = 0; j < name.length; j++) 
		    		{
		    			System.out.println(name[j].get("StockName"));
					}
		    		System.out.println("enter the customer id"); 
		    		Long sellCustomerId=scanner.nextLong();
		    		System.out.println("enter the stock name");
		    		String sellStockName=scanner.next();
		    		System.out.println("enter the amount");
	    			int amount=scanner.nextInt();
		    		int temp=0,temp1=0,temp2=0;
	    			for (int j = 0; j < cId.length; j++) 
	    			{
	    				jsonObject1=(JSONObject) array1.get(j);
	    				if(sellCustomerId==(long) jsonObject1.get("id"))
	    							temp=j;
					}
	    			for (int j = 0; j < name.length; j++) 
	    			{
	    				
	    				if(name[j].get("StockName").equals(sellStockName))
	    						temp1=j;
					}
	    			long checkValue=0;
	    			for (int j = 0; j < cId.length; j++)
	    			{
	    				
	    				object2=(JSONObject) array2.get(j);
	    				a=(JSONArray)object2.get("productShare");
	    				//System.out.println(a.size());
	    			System.out.println(temp+" "+temp1);
	    				
	    				for (int j2 = 0; j2 <name.length; j2++)
	    				{
							
							if(j==temp && j2==temp1)
	    						{
									temp2=j2;
									
									checkValue=(long)a.get(temp2);
									System.out.println(checkValue);
									
	    						}
	    				}
	    			}
	    			System.out.println("hiHIHI"+a.get(temp2));
	    			 while(checkValue<amount)
	    			 {
	    				 if((long)a.get(temp2)==0)
	    				 {
	    					 System.out.println("u didnt buy anything in the product");
	    					 break;
	    				 }
	    				 System.out.println("enter the valid amount");
	 	    			 amount=scanner.nextInt();
	    			 }
	    		}
	    			
	    		}
			 
		catch (IOException | ParseException e) 
			{
				
				e.printStackTrace();
}
	}	
		 @SuppressWarnings({ "unused", "unchecked" })
		long buy(int amount,String symbol)
	    {
	    	Object obj;
	    	 
			JSONArray array2=new JSONArray();
	    	   JSONArray array=new JSONArray();
	    	   long finalShare=0;
	    	  
			try {
					obj = parser.parse(new FileReader("/home/bridgelabz/stock/stockinjson.json"));
					
					array=(JSONArray) obj;
					
					Object object[]=new Object[array.size()];
		 	           
		            JSONObject jsonObject[]=new JSONObject[array.size()];
		         
		            companySymbol=new String[array.size()];
		            name=new JSONObject[array.size()];
		            int i=1;
		    		for (int j = 0; j < array.size(); j++)
		    		{
		    		
		    			object[j]=array.get(j);
		    			
						jsonObject[j]=(JSONObject) object[j];
					
						String n="Stock"+i;
					
						name[j] = (JSONObject) jsonObject[j].get(n);
						i++;
						companySymbol[j]=(String)name[j].get("StockSymbol");
		    		}
		    		
		    		
				} 
			catch (IOException | ParseException e) 
			{
					
					e.printStackTrace();
			}
			int temp=0;
			for (int j = 0; j < companySymbol.length; j++) 
			  {
				  if(companySymbol[j].equals(symbol))
				  {
					  temp=j;
					  Long share=(Long)name[j].get("NumberOfShare");
					  Long price=(Long)name[j].get("SharePrice");
					  share=share-amount;
					  finalShare=amount;
					  name[j].put("NumberOfShare",share);
					  name[j].put("TotalAmount",(share*price));
				  }
			  }
			
			JSONArray obj2=new JSONArray();
	        JSONObject o=new JSONObject();
	        Map<Object, Object> m=new HashMap<>();
	       int  i=1;
			 for (int j = 0; j < name.length; j++) {
				
					String n="Stock"+i;
					i++;
				 m.put(n   ,name[j]);
				 obj2.add(m);
				 FileWriterForStock(obj2);
			 }
		//	o.putAll(m);
			
			// System.out.println(obj2);
			return finalShare; 
	    }
	@SuppressWarnings("resource")
	private void fileWriteForCustomerDetail(JSONArray object2,int count) 
		{
			if(count==0)
			{
				
				try {
					FileWriter file = new FileWriter("/home/bridgelabz/stock/customerproductdetail.json");
					file.write(object2.toJSONString()); 
					file.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				String json1="[";
				ObjectMapper mapper=new ObjectMapper();
				Object obj1;
				try {
					FileWriter file1 = new FileWriter("/home/bridgelabz/stock/customerproductdetail1.json");
					file1.write(object2.toJSONString());
					file1.flush();
					Object obj2 = parser.parse(new FileReader("/home/bridgelabz/stock/customerproductdetail1.json"));
					JSONArray array3=new JSONArray();
					array3=(JSONArray) obj2;
					obj1 = parser.parse(new FileReader("/home/bridgelabz/stock/customerproductdetail.json"));
					JSONArray array2=new JSONArray();
					array2=(JSONArray) obj1;
					for (int i = 0; i < array2.size(); i++)
					{
						
						if(i==0)
							json1=json1+array2.get(i)+",";
						else
							json1=json1+array2.get(i)+",";
					}
					//System.out.println(count+":json1="+json1);
					json1=json1+mapper.writeValueAsString(array3.get(0))+"]";
					//System.out.println("hi"+json1);
					FileWriter file = new FileWriter("/home/bridgelabz/stock/customerproductdetail.json");
					file.write(json1);
					file.flush();
				} catch (IOException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			}
		
		
		}
		
		/*	try 
	 	{
			System.out.println(object2);
			File file1=new File("/home/bridgelabz/stock/customerproductdetail.json");	
			//Object obj2 = parser.parse(new FileReader("/home/bridgelabz/stock/customerproductdetail.json"));
			//System.out.println("file length"+file1.length());
			long length=file1.length();
			System.out.println(length);
			//System.out.println(obj2);
			
	 		if(length!=0)
	 		{
	 			FileWriter file = new FileWriter("/home/bridgelabz/stock/customerproductdetail.json");
	 			System.out.println("11111");
	 			file.write(object2.toJSONString()); 
	 			 file1=new File("/home/bridgelabz/stock/customerproductdetail.json");	
	 			length=file1.length();
				System.out.println(length);
		 		file.flush();
	 		}
	 		else
	 		{
			try {
			//	FileWriter file = new FileWriter("/home/bridgelabz/stock/customerproductdetail.json");
				System.out.println("22222");
				String json1="[";
				ObjectMapper mapper=new ObjectMapper();
				Object obj1 = parser.parse(new FileReader("/home/bridgelabz/stock/customerproductdetail.json"));
				JSONArray array2=new JSONArray();
				array2=(JSONArray) obj1;
				for (int i = 0; i < array2.size(); i++)
				{
					
					if(i==0)
						json1=json1+array2.get(i)+",";
					else
						json1=json1+array2.get(i)+",";
				}
				json1=json1+mapper.writeValueAsString(object2.toString())+"]";
				
				FileWriter file = new FileWriter("/home/bridgelabz/stock/customerproductdetail.json");
				file.write(json1);
				JSONArray temp=object2;
				String temp1="";
				Object	obj = parser.parse(new FileReader("/home/bridgelabz/stock/stockinjson.json"));
				JSONArray array=new JSONArray();
				array=(JSONArray) obj;
				for (int i = 0; i < array.size(); i++)
				{
					String json=(String) array.get(i);
					System.out.println(json);
					temp1=temp1+json;
					file.wr
				}
				System.out.println("temp1="+temp1);
				file.write(object2.toJSONString());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	 		 
	 		
	 		
	 		 
	 	
	 		}
			catch (IOException e1) {
				e1.printStackTrace();
} catch (ParseException e) {
	
	e.printStackTrace();
}
	 	}
		}
			catch (IOException e ) 
		 	{
		 		e.printStackTrace();
		 	}
			 catch (ParseException e) {
					
					e.printStackTrace();
				}
		}*/
	private static void FileWriterForStock(JSONArray obj2)
		{
		 	try (FileWriter file = new FileWriter("/home/bridgelabz/stock/stockinjson.json")) 
		 	{
		 		
		 		file.write(obj2.toJSONString());  
		 		file.flush();
			 
		 	}	 
		 	catch (IOException e) 
		 	{
		 		e.printStackTrace();
		 	}
		}
}

