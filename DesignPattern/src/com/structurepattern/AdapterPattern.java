package com.structurepattern;

public class AdapterPattern 
{
public static void main(String[] args) 
{
	CreditCard card=new BankCustomer();
	card.getBankDetails();
	System.out.println(card.getCreditCard());
}
}
