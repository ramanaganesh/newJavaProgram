package com.behaviouralpattern;

public interface ComputerPartVisitor 
{
	public void visit(Computer computerObject);
	public void visit(Mouse mouseObject);
	public void visit(KeyBoard keyboardObject);
	public void visit(Monitor monitorObject);
}
