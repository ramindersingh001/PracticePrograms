package com.procuder.consumer.using.blocking.queue;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue(10);
		
		Thread t = new Thread(new Producer(queue));
		Thread t1 = new Thread(new Consumer(queue));
		
		t.start();
		t1.start();

		
	}
	

}
