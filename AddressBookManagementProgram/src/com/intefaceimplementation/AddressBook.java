package com.intefaceimplementation;

import java.util.ArrayList;

public interface AddressBook 
{
 ArrayList<Object> addNewPerson(String path);
 void editExistingPerson();
 void deletePersonInAddressBook();
 void sortByZipcode();
 void printout();
 
}
