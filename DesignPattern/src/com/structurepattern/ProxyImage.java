package com.structurepattern;
import com.structurepattern.Image;

public class ProxyImage implements Image
{
	private RealImage realImage;
	String message;
	public ProxyImage(String message)
	{
		System.out.println("proxy");
		this.message=message;
	}
	@Override
	public void display() 
	{
		if (realImage==null) {
			realImage=new RealImage(message);

		}
		realImage.display();
	}
	
}
