package com.executorService.execute.submit.check;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExecuteAndSubmitExample {

	public static void main(String[] args) {
		
		ExecutorService service =null;
		
		try {
			
			service = Executors.newSingleThreadExecutor();
			
			Runnable r = new Runnable() {
				
				String str=null;
				@Override
				public void run() {
					
					System.out.println(str.length());
				}
			};
			
			
			service.execute(r);
			
			service.awaitTermination(1, TimeUnit.SECONDS);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			service.shutdown();
		}
		

	}

}
