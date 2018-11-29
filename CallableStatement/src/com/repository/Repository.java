package com.repository;

public interface Repository {

	boolean checkConnection();
	void insert();
	void update();
	void delete();
	void display();
}
