package com.java.concurrency.executors;

public class Task implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 100; i++) {
			
		
		System.out.println("performing Task  :: " + Thread.currentThread() +" :: "+ i);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}

}
