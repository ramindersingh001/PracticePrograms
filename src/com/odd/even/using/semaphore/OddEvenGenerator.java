package com.odd.even.using.semaphore;

import java.util.concurrent.Semaphore;

public class OddEvenGenerator {
	
	private Semaphore oddSem = new Semaphore(1);
	private Semaphore evenSem = new Semaphore(0);

	
	public void oddPrinter(int n) {

		try {
			oddSem.acquire();
			
			System.out.println(n);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			evenSem.release();
		}

	}
	
	
	public void evenPrinter(int n) {

		try {
			evenSem.acquire();
			
			System.out.println(n);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			oddSem.release();
		}

	}
	
}
