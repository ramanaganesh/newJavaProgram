package com.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;




public class RepositoryImplementation implements Repository
{
	Scanner scanner=new Scanner(System.in);
	static Connection con;
	String check=null;
	static ResultSet resultSet;
	PreparedStatement statement;
	@Override
	public boolean checkConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/BookMyShow","root","root");
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
	public void registerForLogin()
	{
		try {
			statement=con.prepareStatement("insert into register(name,password) values(?,?)");
			do
			{
				System.out.println("enter the name");
				String name=scanner.next();
				System.out.println("enter the password with alphanumeric");
				String password=scanner.next();
				password=passwordValidation(password);
				System.out.println(password);
				statement.setString(1, name);
				statement.setString(2, password);
				statement.addBatch();
				System.out.println("do u want to add more yes/no");
				check=scanner.next();
			}while(check.equals("yes"));
			statement.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	private String passwordValidation(String password) 
	{
		
		boolean flag=false;
		int numberCount=0,letterCount=0;
		do
		{
		while(password.length()<6)
		{
			System.out.println("re enter the password");
			password=scanner.next();
		}
		if(password.length()>6)
		{
		char passwordArray[]=password.toCharArray();
		for (int i = 0; i < passwordArray.length; i++)
		{
			if(passwordArray[i]>='0' && passwordArray[i]<='9')
			{
				numberCount++;
			}
			else if((passwordArray[i]>='a' && passwordArray[i]<='z') || (passwordArray[i]>='A' && passwordArray[i]<='Z'))
			{
				letterCount++;
			}
			
		}
		}
		if(numberCount!=0 && letterCount !=0)
		{
			flag=true;
		}
		if(!flag)
		{
			System.out.println("enter password with alphanumeric");
			password=scanner.next();
		}
		}while(!flag);
		return password;
	}
	@Override
	public boolean loginVerification() 
	{
		try {
			statement=con.prepareStatement("select id,password from register");
			resultSet=statement.executeQuery();
			System.out.println("enter the id");
			int id=scanner.nextInt();
			System.out.println("enter the password");
			String password=scanner.next();
			while (resultSet.next())
			{
				if(resultSet.getInt(1)==id && resultSet.getString(2).equals(password))
				{
					return true;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	@Override
	public void insertShowDetails() {
		String flag=null;
		try {
			statement=con.prepareStatement("insert into showlist(filmname,censorcertificate,language,format,screens,releasemonth,releasedate,releaseyear,bookingstatus) values(?,?,?,?,?,?,?,?,?)");
			do
			{
			System.out.println("enter the film name");
			String filmName=scanner.next();
			statement.setString(1, filmName);
			System.out.println("enter the censor certificate grade");
			String grade=scanner.next();
			statement.setString(2, grade);
			System.out.println("enter the language");
			String language=scanner.next();
			statement.setString(3, language);
			System.out.println("enter the format");
			String format=scanner.next();
			statement.setString(4, format);
			System.out.println("enter the screens");
			int screens=scanner.nextInt();
			statement.setInt(5, screens);
			System.out.println("enter the release month");
			String month=scanner.next();
			statement.setString(6, month);
			System.out.println("enter the release date");
			int date=scanner.nextInt();
			statement.setInt(7,date);
			System.out.println("enter the release year");
			int year=scanner.nextInt();
			statement.setInt(8, year);
			System.out.println("enter the booking status");
			String status=scanner.next();
			statement.setString(9, status);
			statement.addBatch();
			System.out.println("u want to add more show yes/no");
			flag=scanner.next();
			}while(flag.equals("yes"));
			statement.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public void updateDetails()
	{
		int flag=0;
		try {
			statement=con.prepareStatement("select * from showlist");
			resultSet=statement.executeQuery();
			while(resultSet.next())
			{
				System.out.println();
				System.out.print(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5)+" ");
				System.out.println(resultSet.getInt(6)+" "+resultSet.getString(7)+" "+resultSet.getInt(8)+" "+resultSet.getInt(9)+" "+resultSet.getString(10));
			    Date date = new Date();  
			    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
			    String strDate = formatter.format(date);  
			    String d[]=strDate.split("/");
			    String mon=getMonth(Integer.parseInt(d[0]));
				if(Integer.parseInt(d[1])==resultSet.getInt(8) && Integer.parseInt(d[2])==resultSet.getInt(9) && mon.equals(resultSet.getString(7)))
				{
					flag=1;
				}
			}
			statement=con.prepareStatement("update showlist set screens=?,bookingstatus=? where id=?");
			System.out.println("enter the id");
			int id=scanner.nextInt();
			statement.setInt(3, id);
			if(flag==1)
			{
				System.out.println("enter the screen");
				int screen=scanner.nextInt();
				statement.setInt(1,screen);
				
				statement.setString(2,"bookingopen");
			}
			else
			{
				System.out.println("enter the screen");
				int screen=scanner.nextInt();
				statement.setInt(1,screen);
				System.out.println("enter the status");
				String status=scanner.next();
				statement.setString(2,status);
			}
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private String getMonth(int month) {
		switch(month)
		{
		case 1:return "january";
		case 2:return "february";
		case 3:return "march";
		case 4:return "april";
		case 5:return "may";
		case 6:return "june";
		case 7:return "july";
		case 8:return "august";
		case 9:return "september";
		case 10:return "october";
		case 11:return "november";
		case 12:return "december";
		
		}
		return null;
	}
	@Override
	public void deleteFilm() 
	{
		try {
			displayShowList();
			statement=con.prepareStatement("delete from showlist where id=?");
			System.out.println("enter the id");
			int id=scanner.nextInt();
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	@Override
	public void displayShowList() {
		try {
			statement=con.prepareStatement("select * from showlist");
			resultSet=statement.executeQuery();
			while(resultSet.next())
			{
				System.out.println();
				System.out.print("id="+resultSet.getInt(1)+" movieName="+resultSet.getString(2)+" censorBoard="+resultSet.getString(3)+" language="+resultSet.getString(4)+" format="+resultSet.getString(5)+" ");
				System.out.println("screens="+resultSet.getInt(6)+" month="+resultSet.getString(7)+" date="+resultSet.getInt(8)+" year="+resultSet.getInt(9)+" status="+resultSet.getString(10));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
