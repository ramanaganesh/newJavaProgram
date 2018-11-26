package com.structurepattern;
import com.structurepattern.Image;

public class RealImage implements Image
{
String message;
	public RealImage(String message) 
	{
		System.out.println("real");
		this.message=message;
		load(message);
	}
	@Override
	public void display() 
	{
		System.out.println("Real image displaying "+message);
	}
	public void load(String message)
	{
		System.out.println("loading="+message);
	}

}
