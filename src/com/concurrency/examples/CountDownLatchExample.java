package com.concurrency.examples;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		CountDownLatch latch = new CountDownLatch(2);
		
		service.submit(new Producer(latch,"A"));
		service.submit(new Producer(latch,"B"));
		
		
		latch.await();
		
		Thread t3 = new Thread(new Consumer("C"));
		
		t3.start();

	}

}
