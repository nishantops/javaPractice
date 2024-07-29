package com.threading;

public class SumofIntsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           long sum=0;
           long startTime=System.currentTimeMillis();
		for(long i=0;i<=Integer.MAX_VALUE;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime+"ms");
		
	}

}
