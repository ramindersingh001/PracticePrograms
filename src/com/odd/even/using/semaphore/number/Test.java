package com.odd.even.using.semaphore.number;

public class Test {

	public static void main(String[] args) {
		
		int n = 10;
		GenerateNumber numberGenerator = new GenerateNumber();
		
		Thread t1 = new Thread(new OddNumber(n, numberGenerator),"T1");
		Thread t2 = new Thread(new EvenNumber(n, numberGenerator),"T2");
		
		
		t1.start();
		t2.start();

	}

}
