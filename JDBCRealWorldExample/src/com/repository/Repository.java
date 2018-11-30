package com.repository;

public interface Repository 
{
	boolean checkConnection();
	void registerForLogin();
	boolean loginVerification();
	void insertShowDetails();
	void updateDetails();
	void deleteFilm();
	void displayShowList();
}
