package com.odd.even.using.semaphore.number;

public class OddNumber implements Runnable{

	private int number;
	private GenerateNumber g;
	
	 public OddNumber(int number, GenerateNumber g) {
		this.number = number;
		this.g = g;
	}
	
	
	@Override
	public void run() {
		
		for(int i=1;i<=number;i=i+2) {
			g.printOddNumber(i);
		}
		
	}
}
