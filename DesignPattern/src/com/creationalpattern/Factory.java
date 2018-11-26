package com.creationalpattern;

public class Factory {
	
static Vehicle choose(String name)
{
	if(name.equals("bike"))
	{
		return new Bike();
	}
	return new Car();
}
}
