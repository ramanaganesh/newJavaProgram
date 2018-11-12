package com.objectorientedprograms;



public class RegexExpresson {
public static void main(String[] args) {
	
	
	Utility u=new Utility();
	UserDetails user=new UserDetails();
	
	
	System.out.println("enter the first name");
	user.setFname(u.inputString());
	
	
	System.out.println("enter the last name");
	user.setLname(u.inputString());
	
	
	System.out.println("enter the mobile num");
	user.setMobileNum(u.inputString());
	
	System.out.println("enter the date");
	user.setDate(u.inputString());
	user.setDate(u.formatDate(user.getDate()));
	
	System.out.println(u.convertString(user,u.getFileText()));
	
	
}
}
