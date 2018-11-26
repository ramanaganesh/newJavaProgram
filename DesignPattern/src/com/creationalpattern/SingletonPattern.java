package com.creationalpattern;

public class SingletonPattern 
{
	static SingletonPattern patternUsingReflection=new SingletonPattern();
private SingletonPattern()
{
	if(patternUsingReflection!=null)
		 throw new RuntimeException("Cannot create");
	System.out.println("singleton pattern");
}
public static SingletonPattern getInstance()
{
	
	return patternUsingReflection;
}

}
