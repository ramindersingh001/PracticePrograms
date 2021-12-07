package com.factory.method.implementation;

public class Test {

	public static void main(String[] args) {
		
		Computer c1 = ComputerFactory.getInstance(ComputerType.PC, 4, 500);
		Computer c2 = ComputerFactory.getInstance(ComputerType.Laptop, 8, 500);
		
		System.out.println(c1);
		
		System.out.println(c2);

	}

}
