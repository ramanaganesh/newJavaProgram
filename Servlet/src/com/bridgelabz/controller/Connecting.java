package com.bridgelabz.controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


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
	public static void display(Connection connection,PrintWriter out)
	{
		 try {
				PreparedStatement preparedStatement=connection.prepareStatement("select * from userdetails");
				ResultSet resultset=preparedStatement.executeQuery();
				while(resultset.next())
				{
					out.println(resultset.getString(1)+" "+resultset.getString(2)+"/n");
				}
		 }
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	} 
	
}
