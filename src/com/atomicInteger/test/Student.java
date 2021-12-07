package com.atomicInteger.test;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {

	private AtomicInteger counter = new AtomicInteger();
	
	
	public  int getCounter(){
		return counter.get();
	}
	
	public int incrementValue(){
		return counter.getAndIncrement();
	}
}
