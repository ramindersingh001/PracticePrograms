package com.atomic.integer.check;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread r = new MyThread();
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r);
		t2.start();

		t1.join();
		t2.join();
		
		System.out.println("Count value is : "+ r.getCount());
	}

}
