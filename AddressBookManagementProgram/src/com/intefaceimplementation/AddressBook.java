package com.intefaceimplementation;

import java.util.List;

import com.module.Person;

public interface AddressBook 
{
 List<Person> addNewPerson();
 List<Person> editExistingPerson(List<Person> list);
 List<Person> deletePersonInAddressBook(List<Person> list);
 void sortByZipcode(List<Person> list);
 void printout();
 
}
