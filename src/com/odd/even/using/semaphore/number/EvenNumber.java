package com.odd.even.using.semaphore.number;

public class EvenNumber implements Runnable {

	private int number;
	private GenerateNumber g;
	
	 public EvenNumber(int number, GenerateNumber g) {
		this.number = number;
		this.g = g;
	}
	
	
	@Override
	public void run() {
		
		for(int i=2;i<=number;i=i+2) {
			g.printEvenNumber(i);
		}
		
	}
}
