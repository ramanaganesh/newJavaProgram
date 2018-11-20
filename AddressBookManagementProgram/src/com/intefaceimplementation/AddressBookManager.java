package com.intefaceimplementation;

import java.util.ArrayList;

public interface AddressBookManager 
{
ArrayList<Object> createNewAddressBook(String path);
void openAddressBook();
void saveAddressBook(ArrayList<Object> arrayList,String path);
void closeAddressBook();
void quitAddressBook();
}
