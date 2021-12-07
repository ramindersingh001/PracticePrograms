package com.odd.even.using.semaphore.number;

import java.util.concurrent.Semaphore;

public class GenerateNumber {
		
	private Semaphore oddSem = new Semaphore(1);
	private Semaphore evenSem = new Semaphore(0);
	
	
	public void printOddNumber(int n) {
		
		try {
			oddSem.acquire();
			System.out.println("Number is : "+n + "  "+ Thread.currentThread().getName());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(oddSem !=null) {
				evenSem.release();
			}
		}
	}
	
	public void printEvenNumber(int n) {

		try {
			evenSem.acquire();
			System.out.println("Number is : " + n + "  "+ Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (evenSem != null) {
				oddSem.release();
			}
		}
	}

}
