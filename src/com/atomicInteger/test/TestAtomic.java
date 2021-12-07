package com.atomicInteger.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestAtomic {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		Student st= new Student();
		Runnable r = new Runnable() {

			@Override
			public void run() {
				
				for(int i=0;i<20000;i++) {
					st.incrementValue();
				}
				
			}
			
		};
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				
				for(int i=0;i< 80000;i++) {
					st.incrementValue();
				}
				
			}
			
		};
		
		service.submit(r);
		service.submit(r1);
		
		service.awaitTermination(1, TimeUnit.SECONDS);
		
		System.out.println("Counter value is : "+ st.getCounter());
		
		

	}

}
