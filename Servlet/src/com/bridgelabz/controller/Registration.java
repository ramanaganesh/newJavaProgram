package com.bridgelabz.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Registration extends HttpServlet
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	 
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	 
	        String n = request.getParameter("userName");
	        String p = request.getParameter("email-id");
	        String e = request.getParameter("password");
	       
	        
			Connection con=Connecting.getConnection();	
				
	           
	 
				try {
					PreparedStatement ps;
					
					ps = con.prepareStatement("insert into userdetails values(?,?,?)");
					ps.setString(1, n);
		            ps.setString(2, p);
		            ps.setString(3, e);
					int i = ps.executeUpdate();
					if (i > 0)
		                out.print("You are successfully registered...");
			    	  out.println("<html><body bgcolor='yellow'>Login?<a href='login.html'>login</a></body></html>");

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            
				out.close();
	    }

}
