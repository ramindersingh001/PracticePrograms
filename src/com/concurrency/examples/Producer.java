package com.concurrency.examples;

import java.util.concurrent.CountDownLatch;

public class Producer implements Runnable{

	private CountDownLatch latch =null;
	String threadName;
	
	public Producer(CountDownLatch latch, String name) {
		this.latch = latch;
		this.threadName = name;
	}
	
	@Override
	public void run() {

		System.out.println("Producer Block started " + threadName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Producer Block Completed " + threadName);
		latch.countDown();
	}

}
