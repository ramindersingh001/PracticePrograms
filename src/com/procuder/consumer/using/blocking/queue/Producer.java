package com.procuder.consumer.using.blocking.queue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Integer> queue;
	
	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	
	
	@Override
	public void run() {

		Random rn = new Random();
		while (true) {
			try {
				Thread.sleep(2000);
				int element = rn.nextInt();
				queue.put(element);
				System.out.println("Produced Element is : " + element);
			} catch (InterruptedException e) {
                e.printStackTrace();
			}
		}

	}
	}
