package com.creationalpattern;

import java.util.Scanner;

public class TestFactory 
{
	public static void main(String[] args) 
	{
		Vehicle vehicle;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the type\n1.bike \n2.car");
		String type=scanner.next();
		if(type.equals("bike"))
			vehicle=Factory.choose(type);
		else
			vehicle=Factory.choose(type);
		vehicle.start();
		scanner.close();
	}
}
