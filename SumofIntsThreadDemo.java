package com.threading;

public class SumofIntsThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		long startTime=System.currentTimeMillis();
	     var thread1= new SumThread(0,Integer.MAX_VALUE/2);
	     var thread2= new SumThread((Integer.MAX_VALUE/2)+1,Integer.MAX_VALUE);
	     thread1.start();
	     thread1.setName("Th1 "+thread1.getName());
	     thread2.start();
	     thread2.setName("Th2 ");
	     thread1.join();
	     thread2.join();
	     long result = thread1.getResult()+thread2.getResult();
	     System.out.println(result);
	      long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime+"ms");
		System.out.println("This is the result of 2 thread with id's as: "+thread1.getId()+" "+ thread2.getId());
		System.out.println("This is the result of 2 thread with name's as: "+thread1.getName()+" & "+ thread2.getName());
		
		
		
		
		
/* wrong o/p because not waiting for th1 and th2 to complete their execution
		therefore all leftout times are executing before completion
		of thread method.*/
//        long startTime=System.currentTimeMillis();
//	     var thread1= new SumThread(0,Integer.MAX_VALUE/2);
//	     var thread2= new SumThread((Integer.MAX_VALUE/2)+1,Integer.MAX_VALUE);
//	     thread1.start();
//	     thread2.start();
//	     long result = thread1.getResult()+thread2.getResult();
//	     System.out.println(result);
//	      long endTime=System.currentTimeMillis();
//		System.out.println(endTime-startTime+"ms");
//		
		
	}

}
