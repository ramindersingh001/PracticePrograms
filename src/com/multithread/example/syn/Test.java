package com.multithread.example.syn;

public class Test {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		
		t.start();
		
		synchronized (t) {
			
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Total sum is : "+ t.sum);

	}

}
