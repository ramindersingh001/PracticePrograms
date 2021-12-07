package com.concurrency.examples;

import java.util.concurrent.CountDownLatch;

public class Consumer implements Runnable{

	String threadName;
	
	public Consumer(String name) {
		this.threadName = name;
	}
	
	@Override
	public void run() {		
		System.out.println("Consumer Block started "+ threadName);		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}	
		System.out.println("Consumer Block Completed "+ threadName);
	}

}
