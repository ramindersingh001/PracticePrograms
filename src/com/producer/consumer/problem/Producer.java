package com.producer.consumer.problem;

import java.util.List;
import java.util.Random;

public class Producer implements Runnable{

	private List<Integer> list =null;
	private int MAX_SIZE= 5;
	public Producer(List<Integer> list) {
		 this.list = list;
	}
	
	
	public void run() {

		while (true) {
			synchronized (list) {
				while (list.size() >= MAX_SIZE) {
					try {
						System.out.println("List size is full. Waiting Consumer thread to consume data..");
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Random r = new Random();
				int data = r.nextInt(100);
				list.add(data);

				System.out.println("Produced data : "+data);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				list.notify();

			}

		}

	}

}
