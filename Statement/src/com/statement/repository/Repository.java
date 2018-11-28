package com.statement.repository;

import com.statement.models.CompanyEmployeeDetails;

public interface Repository 
{
	public boolean getConnectionAndCreateStatement();

	public void insert(CompanyEmployeeDetails employeeDetails);

	public void update(CompanyEmployeeDetails employeeDetails);

	public void delete(CompanyEmployeeDetails employeeDetails);

	public void display(CompanyEmployeeDetails employeeDetails);
	
}
