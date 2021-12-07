package com.parent.child.relation;


public class Child extends Parent{

	public void show() throws ClassNotFoundException {
		throw new ClassNotFoundException("Class cast exception");
	}
	
}
