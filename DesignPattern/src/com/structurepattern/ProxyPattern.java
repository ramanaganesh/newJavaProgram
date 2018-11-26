package com.structurepattern;

public class ProxyPattern 
{
public static void main(String[] args) {
	Image image=new ProxyImage("hi");
	image.display();
	System.out.println();
	image.display();
}
}
