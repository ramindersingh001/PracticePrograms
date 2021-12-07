package com.odd.even.using.semaphore;

public class EvenNumberGenerator implements Runnable{

	private OddEvenGenerator g;
	private int n;
	
	public EvenNumberGenerator(OddEvenGenerator g, int n) {
		this.g = g;
		this.n = n;
	}
	
	
	@Override
	public void run() {
		for(int i=2; i<=n;i=i+2) {
			g.evenPrinter(i);
		}
		
	}
	
}
