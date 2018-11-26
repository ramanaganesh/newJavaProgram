package com.structurepattern;

public class Samsung implements MobileShop
{

	@Override
	public void getModelNo() {
		System.out.println("model no=e353453");
	}

	@Override
	public void getprice() {
		System.out.println("price=50000");		
	}

}
