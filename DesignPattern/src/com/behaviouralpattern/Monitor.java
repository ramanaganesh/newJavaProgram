package com.behaviouralpattern;

public class Monitor implements ComputerPart
{

	@Override
	public void accept(ComputerPartVisitor visitorObject) {
		visitorObject.visit(this);		
	}

}
