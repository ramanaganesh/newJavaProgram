package com.behaviouralpattern;

public class VisitorPattern
{
	public static void main(String[] args) {
			ComputerPart computerPart=new Computer();
			computerPart.accept(new ComputerVisitorDemo());
	}
}
