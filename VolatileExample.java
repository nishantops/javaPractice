package com.threading;

public class VolatileExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SharedBooleanResource sharedBooleanResource= new SharedBooleanResource();
		Thread workerThread = new Thread(()->sharedBooleanResource.doWork());	
		workerThread.start();
		
		
		
		Thread stopperThread = new Thread(()->
		{ 
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sharedBooleanResource.setStopFlag();
		}
		);
		
		stopperThread.start();
		workerThread.join();
		stopperThread.join();
		
				
		
	}

}
