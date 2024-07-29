package com.threading;

public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResource sharedResource = new SharedResource();
		
        Thread producerThread = new Thread(
        		()-> {
        for(int i=1;i<=5;i++)
        {
        	sharedResource.produce(i);
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        		} );
       producerThread.start();
	
        Thread consumerThread = new Thread(
        		()-> {
        for(int i=1;i<=5;i++)
        {
        	sharedResource.consume();
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        		} );
        consumerThread.start();
	}

}
