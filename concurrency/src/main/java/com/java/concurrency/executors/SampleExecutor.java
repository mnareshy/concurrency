package com.java.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleExecutor {

	public void execute()
	{
		for (int i = 0; i < 100; i++) {

			System.out.println("performing Task  :: " + Thread.currentThread() +" :: "+ i);

//			ExecutorService executor = Executors.newSingleThreadExecutor();
			
			ExecutorService executor = Executors.newCachedThreadPool();
			
			
			Task task =  new Task();

			executor.execute(task);
			executor.execute(task);


			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
		
		System.out.println("*********I am Done - Main Thread ************");

	}
}
