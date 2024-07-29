package com.threading;

public class MethodDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		Thread newthread = new Thread();
         Long startTime = System.currentTimeMillis();
        for(int i=0;i<=5;i++)
        {
        	System.out.println(i);
        	newthread.sleep(1000);
        	
        }
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        
	}

}
