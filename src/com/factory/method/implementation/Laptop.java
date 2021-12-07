package com.factory.method.implementation;

public class Laptop implements Computer {

	private int ramSize;
	private int hardDiskSize;
	
	
	public Laptop(int ramSize, int hardDiskSize) {
		this.ramSize = ramSize;
		this.hardDiskSize = hardDiskSize;
	}
	
	@Override
	public int ram() {
		return this.ramSize;	
	}

	@Override
	public int hardDisk() {
		return this.hardDiskSize;
	}

	@Override
	public String toString() {
		return "Laptop [ramSize=" + ramSize + ", hardDiskSize=" + hardDiskSize + "]";
	}
}
