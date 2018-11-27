package com.behaviouralpattern;

public class Mouse implements ComputerPart
{

	public void accept(ComputerPartVisitor visitorObject) {
		visitorObject.visit(this);		
	}

}
