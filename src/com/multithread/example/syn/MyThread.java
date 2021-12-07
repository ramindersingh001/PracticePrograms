package com.multithread.example.syn;

public class MyThread extends Thread {

	int sum =0;
	
	public synchronized void run() {
		
		
		for (int i = 0; i <= 10; i++) {

			sum += i;
			
		}
		this.notify();
	}
	
}
