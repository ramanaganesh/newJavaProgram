package com.bridgelabz.controller;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connecting 
{
	static Connection con;
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/servlet","root","root");
			if(con!=null)
				return con;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
			  
			return null;
		
	            
	} 
	
}
