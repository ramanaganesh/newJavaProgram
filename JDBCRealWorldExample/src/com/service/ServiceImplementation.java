package com.service;

import com.repository.Repository;
import com.repository.RepositoryImplementation;

public class ServiceImplementation implements Service
{
Repository repository=new RepositoryImplementation();
	@Override
	public boolean check() {
		boolean check=repository.checkConnection();
		return check;
	}

}
