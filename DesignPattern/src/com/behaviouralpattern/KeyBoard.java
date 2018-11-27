package com.behaviouralpattern;

public class KeyBoard implements ComputerPart
{

	@Override
	public void accept(ComputerPartVisitor visitorObject) {
		visitorObject.visit(this);
		
	}

}
