package com.bridgelabz.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	 
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	 
	        String n = request.getParameter("Name");
	        String p = request.getParameter("Email Id");
	        String e = request.getParameter("Password");
	        Connection con=null;
	 
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            
	            con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/servlet", "root", "root");
	        } catch (Exception e2) {
	            System.out.println(e2);
	        }
	 
	 
	            PreparedStatement ps;
				try {
					ps = con
					        .prepareStatement("insert into userdetails values(?,?,?)");
					ps.setString(1, n);
		            ps.setString(2, p);
		            ps.setString(3, e);
		           
		 
		            int i = ps.executeUpdate();
		            if (i > 0)
		                out.print("You are successfully registered...");
		 
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	 
	            
	        
	        out.close();
	    }

}
