package com.module;



public class Person 
{
private String firstName,lastName;
public Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}


public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", Address=" + address + "]";
}

}
