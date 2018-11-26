package com.creationalpattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable
{
	private List<String> emp;
public Employee() {
	emp=new ArrayList<>();
}
public Employee(List<String> emp)
{
	this.emp=emp;
}
public void loadData()
{
	emp.add("ramana");
	emp.add("aman");
	emp.add("sowndar");
	emp.add("beast");
		emp.add("muthu");
}
public List<String> getList()
{
	return this.emp;
}
@Override
protected Object clone() throws CloneNotSupportedException 
{
	List<String> temp=new ArrayList<>();
	for (String string : this.getList()) 
	{
		temp.add(string);
	}
	return new Employee(temp);
}
}