package com.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RepositoryImplementation implements Repository
{

	 static Connection con;
	 static CallableStatement stmt;
	 static ResultSet resultSet;
	 Scanner scanner=new Scanner(System.in);
	@Override
	public boolean checkConnection() 
	{try {
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/college","root","root");
		if(con!=null)
		{
			return true;
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	  
	return false;
	}
	@Override
	public void insert() {
		try {
			stmt=con.prepareCall("{call crudOperation(?,?,?,?)}");
			System.out.println("enter the name");
			String name=scanner.next();
			System.out.println("enter the department");
			String dept=scanner.next();
			stmt.setString(1,name);  
			stmt.setString(2,dept);
			stmt.setInt(3, 1);
			stmt.setInt(4, 1);
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void update() {
		try {
			stmt=con.prepareCall("{call crudOperation(?,?,?,?)}");
			display();
			System.out.println("enter the id");
			int id=scanner.nextInt();
			System.out.println("enter the name");
			String name=scanner.next();
			System.out.println("enter the dept");
			String dept=scanner.next();
			stmt.setString(1,name);  
			stmt.setString(2,dept);
			stmt.setInt(3, 2);
			stmt.setInt(4, id);
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void delete() {
		try {
			stmt=con.prepareCall("{call crudOperation(?,?,?,?)}");
			display();
			System.out.println("enter the id");
			int id=scanner.nextInt();
			stmt.setString(1,"raju");  
			stmt.setString(2,"cs");
			stmt.setInt(3, 3);
			stmt.setInt(4, id);
			stmt.execute();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void display()
	{
		try {
			stmt=con.prepareCall("{call crudOperation(?,?,?,?)}");
			stmt.setString(1,"raju");  
			stmt.setString(2,"cs");
			stmt.setInt(3, 4);
			stmt.setInt(4, 1);
			boolean flag=stmt.execute();
			while(flag)
			{
				resultSet=stmt.getResultSet();
				while(resultSet.next())
					System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
				flag=stmt.getMoreResults();
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
