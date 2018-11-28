package com.statement.models;

public class CompanyEmployeeDetails 
{

private int salary;
private String name;

@Override
public String toString() {
	return "CompanyEmployeeDetails [salary=" + salary + ", name=" + name + "]";
}

public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
