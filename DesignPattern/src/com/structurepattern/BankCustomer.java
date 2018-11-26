package com.structurepattern;

public class BankCustomer extends BankDetail implements CreditCard 
{

	@Override
	public void getBankDetails()
	{
		setAccountHolder("ramana");
		setBankName("city union bank");
	}
	@Override
	public String getCreditCard() {
		String name=getAccountHolder();
		String bankName=getBankName();
		return "account holder name="+name+" \nbank name="+bankName;
	}
	
	

}
