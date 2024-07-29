package com.threading;

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		var threadA = new Thread(
			()-> {
				for(int i=1;i<=5;i++)
				{
					System.out.println("Thread A - count: "+i);
					try {
						Thread.sleep(500);
					}catch (Exception e){
			            throw new RuntimeException(e);
				                        }
				}
				}
			);
		threadA.start();
		threadA.join();
		System.out.println("Main Thread ended");
			}
	}

