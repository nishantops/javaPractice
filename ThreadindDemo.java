package com.threading;

public class ThreadindDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Over Here parallel or concurrent execution
		/* Middle print main because JVM communicates with OS to schedule CPU time 
		 * for a thread whenever start method is called
		 * therefore while executing further lines of code if thread is allocated time
		 * then it starts 
		 * */
		 
           Thread thread = new Thread();
           thread.start();
           
           Thread thread1 = new Thread(()-> System.out.println("Hello from Java Thread"));
           thread1.start();
           
           Runnable runnable = ()-> System.out.println("hi from Java Thread");
           Thread thread2 = new Thread(runnable);
           thread2.start();
          
           System.out.println("Hello from main thread");
	}

}
