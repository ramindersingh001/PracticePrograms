package com.procuder.consumer.using.blocking.queue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	
    private BlockingQueue<Integer> queue;
	
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	
	
	@Override
	public void run() {

		while (true) {

			try {
				Thread.sleep(2000);

				int element = queue.take();

				System.out.println("Consumed element is : " + element);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
