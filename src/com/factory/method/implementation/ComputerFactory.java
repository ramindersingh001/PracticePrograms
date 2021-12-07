package com.factory.method.implementation;

public class ComputerFactory {

	private ComputerFactory() {
		
	}
	
	public static Computer getInstance(ComputerType type, int ramSize, int hardDiskSize) {
		
		switch(type) {
		
		case PC:
			return new PC(ramSize, hardDiskSize);
		case Laptop:
			return new Laptop(ramSize, hardDiskSize);
			
		default:
			return (Computer) new RuntimeException("No match available for specified Computer type");
			
		}
	}
	
}
