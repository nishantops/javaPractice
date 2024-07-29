package com.threading;

public class PriorityExample implements Runnable
{

	private String name ;
	
	public PriorityExample(String name) {
		this.name=name;
	}
	
	
	
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(name + " Count: "+i+" ,Priority:"+Thread.currentThread().getPriority());
			try {
				Thread.sleep(500);
			}catch (Exception e){
	            throw new RuntimeException(e);
		                        }
		}
		
		
	}

}
