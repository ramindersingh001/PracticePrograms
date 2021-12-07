package com.odd.even.using.semaphore;

public class OddNumberGenerator implements Runnable{
	
	private OddEvenGenerator g;
	private int n;
	
	public OddNumberGenerator(OddEvenGenerator g, int n) {
		this.g = g;
		this.n = n;
	}
	
	
	@Override
	public void run() {
		for(int i=1; i<=n;i=i+2) {
			g.oddPrinter(i);
		}
		
	}
	

}
