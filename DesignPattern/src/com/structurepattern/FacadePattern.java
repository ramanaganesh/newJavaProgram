package com.structurepattern;

public class FacadePattern 
{
public static void main(String[] args) {
	ShopKeeper  keeper=new ShopKeeper();
	//here hiding object from the clients
//	System.out.println(keeper);
	keeper.redmiSale();
//	System.out.println(keeper);
	keeper.samsungSale();
}
}
