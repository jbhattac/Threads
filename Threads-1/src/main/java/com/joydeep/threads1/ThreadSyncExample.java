package com.joydeep.threads1;

public class ThreadSyncExample {
	
	private int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSyncExample ts = new ThreadSyncExample();
		ts.doWork();
	}
	
	private  synchronized void incrementCount(){
		count++;
	}
	
	public void doWork(){
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i <10000; i++) {
					incrementCount();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable(){

			public void run() {
				for (int i = 0; i <10000; i++) {
					incrementCount();
				}
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The final value of count :: "+ count);
	}

}
