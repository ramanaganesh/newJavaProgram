package com.statement.services;


import com.statement.repository.Repository;
import com.statement.repository.RepositoryImplementation;



public class ServiceImplementation implements Service
{
Repository repositoryImpl=new RepositoryImplementation();
	@Override
	public boolean change() {
		
		boolean check=repositoryImpl.getConnectionAndCreateStatement();
		return check;
		
	}

}
