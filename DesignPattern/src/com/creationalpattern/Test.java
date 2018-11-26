package com.creationalpattern;

import java.lang.reflect.Constructor;

class Test
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)  throws Exception
	{
		
		SingletonPattern s=SingletonPattern.getInstance();
		SingletonPattern s1=SingletonPattern.getInstance();
		System.out.println(s.hashCode()+" "+s1.hashCode());
		
		//using reflection
		Class<?> clazz;
		
			clazz = Class.forName("com.creationalpattern.SingletonPattern");
			Constructor<SingletonPattern> c=(Constructor<SingletonPattern>) clazz.getDeclaredConstructor();
			c.setAccessible(true);
			SingletonPattern s2=c.newInstance();
			System.out.println(s2.hashCode());
	
		
	}
}

