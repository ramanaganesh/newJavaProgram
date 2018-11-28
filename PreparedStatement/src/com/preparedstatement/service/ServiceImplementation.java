package com.preparedstatement.service;

import com.preparedstatement.repository.Repository;
import com.preparedstatement.repository.RepositoryImplementation;

public class ServiceImplementation implements Service
{

	@Override
	public boolean check() {
			Repository repository=new RepositoryImplementation() ;
			boolean check=repository.getConnection();
			return check;
	}

}
