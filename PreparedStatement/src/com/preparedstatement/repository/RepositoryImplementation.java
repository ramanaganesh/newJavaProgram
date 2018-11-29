package com.preparedstatement.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RepositoryImplementation implements  Repository
{
 static Connection con;
 static PreparedStatement stmt;
 static ResultSet resultSet;
 Scanner scanner=new Scanner(System.in);
	@Override
	public boolean getConnection() {
		try {
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
	public void insert(String name, String dept) 
	{
		System.out.println(name+" "+dept);
		System.out.println(con);
		
		try {
				stmt =con.prepareStatement("insert into student(name,department) values(?,?)");
				stmt.setString(1, name);
				stmt.setString(2, dept);
				stmt.executeUpdate();  
			}
		catch (SQLException e) 
			{
				e.printStackTrace();
			}
		
	}

	@Override
	public void update() 
	{
		try {
			stmt=con.prepareStatement("select * from student");
			resultSet=stmt.executeQuery();
			while(resultSet.next())
			{
				
				//if(resultSet.next()!=false)
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
			System.out.println("enter the id");
			int id=scanner.nextInt();
			System.out.println("enter the dept name");
			String dept=scanner.next();
			stmt=con.prepareStatement("update student set department=? where id=?");
			stmt.setString(1,dept);
			stmt.setInt(2,id );
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete() {
		try {
			stmt=con.prepareStatement("select * from student");
			resultSet=stmt.executeQuery();		
			while(resultSet.next())
			{
				
				//if(resultSet.next()!=false)
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
			System.out.println("enter the id");
			int id=scanner.nextInt();
			stmt=con.prepareStatement("delete from student where id=?");
			stmt.setInt(1,id );
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public void display() {
		try {
			stmt=con.prepareStatement("select * from student");
			resultSet=stmt.executeQuery();
			while(resultSet.next())
			{
				
				//if(resultSet.next()!=false)
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
