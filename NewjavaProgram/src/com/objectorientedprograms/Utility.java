package com.objectorientedprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utility 
{
		
		BufferedReader br;
		private final String REGEX_NAME = "<<name>>";
		private final String REGEX_FULLNAME = "<<full name>> ";
		private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
		private final String REGEX_DATE = "01/01/2016";
		
		public Utility() 
		{
			br=new BufferedReader(new InputStreamReader(System.in));
		}

		Pattern p=null;
		public String convertString(UserDetails user,String message)
		{
			Pattern p = Pattern.compile(REGEX_NAME);
			Matcher m = p.matcher(message); 
			message = m.replaceAll(user.getFname());

			p = Pattern.compile(REGEX_FULLNAME);
			m = p.matcher(message); 
			message = m.replaceAll(user.getFname()+" "+user.getLname()+" ");

			p = Pattern.compile(REGEX_MOBILE_NO);
			m = p.matcher(message); 
			message = m.replaceAll(user.getMobileNum());

			p = Pattern.compile(REGEX_DATE);
			m = p.matcher(message); 
			message = m.replaceAll(user.getDate());
			return message;
		}
		
		public String inputString()
		{
			try {
				return br.readLine();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			return " ";
		}
		
		public Date printDate(String date){
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try{
				return sdf.parse(date);
			}
			catch(ParseException pe){
				return null;
			}
		}
		public String formatDate(String date) {
			SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
		
			return s.format(printDate(date));
		}
		
		public String getFileText()
		{
			try
			{
				
				br=new BufferedReader(new FileReader(new File("/home/bridgelabz/RegexExpression.txt")));
				StringBuilder sb=new StringBuilder();
				String line=br.readLine();
				while(line!=null)
				{
					
					sb.append(line);
					sb.append(System.lineSeparator());
					line=br.readLine();
					break;
				}
				System.out.println(sb.toString());
				return sb.toString();
			 }
			catch(Exception e)
			{
				return null;
			}
			finally
			{
				try
				{
					br.close();
				}
				catch(IOException ioe){
				}	
			}
		}
}
