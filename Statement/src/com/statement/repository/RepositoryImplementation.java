package com.statement.repository;

import java.sql.*;
import java.util.Scanner;

import com.statement.models.CompanyEmployeeDetails;

public class RepositoryImplementation implements Repository
{
	Scanner scanner=new Scanner(System.in);
	static ResultSet resultSet;
	static Statement stmt;
	static String sql;
//	Class.forName("com.mysql.jdbc.Driver"); 
	@Override
	public boolean getConnectionAndCreateStatement() 
	{
	
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/company","root","root");  
			stmt=con.createStatement();
			if(con!=null)
				return true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public void update(CompanyEmployeeDetails employeeDetails) {
		
		try {
			resultSet=stmt.executeQuery("select * from person");
			while(resultSet.next())
			{
				
				//if(resultSet.next()!=false)
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getLong(3));
			}
			System.out.println("enter the id");
			sql="update person set salary=15000 where id="+scanner.nextInt();
			System.out.println("the query is:"+sql);
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void delete(CompanyEmployeeDetails employeeDetails) {
	
		try {
			resultSet=stmt.executeQuery("select * from person");
			while(resultSet.next())
			{
				
				//if(resultSet.next()!=false)
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getLong(3));
			}
			System.out.println("enter the id");

			sql="delete from person where id="+scanner.nextInt();
			System.out.println("the query is:"+sql);
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void display(CompanyEmployeeDetails employeeDetails) {
		
		
		try {
			resultSet=stmt.executeQuery("select * from person");
			while(resultSet.next())
			{
				
				//if(resultSet.next()!=false)
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getLong(3));
			}
			System.out.println("enter the id");
			sql="select name,salary from person where id="+scanner.nextInt();
			System.out.println("the query is:"+sql);
			resultSet=stmt.executeQuery(sql);
			while(resultSet.next())
					{
			System.out.println(resultSet.getString(1)+" "+resultSet.getLong(2));
					}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	@Override
	public void insert(CompanyEmployeeDetails employeeDetails) {
		sql="insert into person (name,salary) values('"+employeeDetails.getName()+"',"+employeeDetails.getSalary()+")";
		System.out.println(sql);
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
