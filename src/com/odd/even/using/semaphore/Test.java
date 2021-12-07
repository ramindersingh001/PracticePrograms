package com.odd.even.using.semaphore;

public class Test {

	public static void main(String[] args) {
		
		int n=10;
		
		OddEvenGenerator gen = new OddEvenGenerator();
		
		OddNumberGenerator oddNum = new OddNumberGenerator(gen, n);
		EvenNumberGenerator evenNum = new EvenNumberGenerator(gen, n);
		
		Thread t1 = new Thread(oddNum, "t1");
		Thread t2 = new Thread(evenNum,"t2");
		
		t1.start();
		t2.start();

	}

}
