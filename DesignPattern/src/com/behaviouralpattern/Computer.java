package com.behaviouralpattern;

public class Computer implements ComputerPart {
	ComputerPart[] parts;

	   public Computer(){
	      parts = new ComputerPart[] {new Mouse(), new KeyBoard(), new Monitor()};		
	   } 


	  


	





	@Override
	public void accept(ComputerPartVisitor visitorObject) {
		for (int i = 0; i < parts.length; i++) {
	         parts[i].accept(visitorObject);
	      }
	      visitorObject.visit(this);
		
	}
	
}
