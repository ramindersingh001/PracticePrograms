package com.producer.consumer.problem;

import java.util.List;
import java.util.Random;

public class Consumer implements Runnable{

	private List<Integer> list =null;
	public Consumer(List<Integer> list) {
		 this.list = list;
	}
	
	
	public void run() {

		while (true) {
			synchronized (list) {
				while (list.size() == 0) {
					try {
						System.out.println("List size is empty. Waiting Producer thread to produce data..");
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int data = list.remove(0);
				System.out.println("Consumed data is: " + data);
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
