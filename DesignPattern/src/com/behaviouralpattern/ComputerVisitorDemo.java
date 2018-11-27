package com.behaviouralpattern;

public class ComputerVisitorDemo implements ComputerPartVisitor
{

	@Override
	public void visit(Computer computerObject) {
		System.out.println("displaying computer object");
		
	}

	@Override
	public void visit(Mouse mouseObject) {
			System.out.println("displaying mouse object");		
	}

	@Override
	public void visit(KeyBoard keyboardObject) {
			System.out.println("displaying Keyboard Object");
	}

	@Override
	public void visit(Monitor monitorObject) {
			System.out.println("displaying monitor object");
	}

}
