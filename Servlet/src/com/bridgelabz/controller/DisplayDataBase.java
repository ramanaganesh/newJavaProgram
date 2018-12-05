package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayDataBase extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public void init() throws ServletException 
    {      
      
    }
    public void doGet(HttpServletRequest request, 
        HttpServletResponse response) throws ServletException, 
        IOException 
    {            
        // Setting up the content type of web page      
        response.setContentType("text/html");
        // Writing the message on the web page      
        PrintWriter out = response.getWriter();  
        String n = request.getParameter("user name");
        String p = request.getParameter("password");
       Connection connection=Connecting.getConnection();

       int flag=0;
       try {
		PreparedStatement preparedStatement=connection.prepareStatement("select * from userdetails");
		ResultSet resultset=preparedStatement.executeQuery();
		while(resultset.next())
		{
		
			if(n.equals(resultset.getString(1)) && p.equals(resultset.getString(3)))
			{
				out.write("you are authorized one to access database");
				flag=1;
			}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       if(flag==0)
       {
    	  out.println("first register ur details in our Register website page..../n");
    	  out.println("<html><a href='UserRegister.html'>registerpage</a></html>");
       }
    }
    public void destroy() 
    {      
       // Leaving empty. Use this if you want to perform  
       //something at the end of Servlet life cycle.   
    }
}
