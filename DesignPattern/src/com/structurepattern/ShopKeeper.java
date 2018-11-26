package com.structurepattern;

public class ShopKeeper 
{
	private Redmi redmi;
	private Samsung samsung;
	public ShopKeeper() 
	{
		redmi=new Redmi();
		samsung=new Samsung();
	}
	void redmiSale()
	{
		redmi.getModelNo();
		redmi.getprice();
	}
	void samsungSale()
	{
		samsung.getModelNo();
		samsung.getprice();
	}
	
}
