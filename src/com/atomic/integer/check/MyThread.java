package com.atomic.integer.check;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable{

	//private int count;
	
	private AtomicInteger count = new AtomicInteger();
	@Override
	public void run() {
		
		for(int i=1; i<5; i++) {
			//count++;
			count.incrementAndGet();
		}
		
	}
	/*public int getCount() {
		return count;
	}*/

	public int getCount() {
        return this.count.get();
    }
	
}
