package com.preparedstatement.repository;

public interface Repository {
public boolean getConnection();
void insert(String name,String dept);
void update();
void delete();
void display();
}
