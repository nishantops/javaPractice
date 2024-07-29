package com.lambdas;

public class StaticMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperations ops=(a,b)->
		{
			int sum=a+b;
			System.out.println(sum);
			return sum;
		};
		ops.operation(2,3);
		
		ArithmeticOperations methodref = StaticMethodRef::performAddition;
		methodref.operation(2, 3);
	}
	
	
	
		public static int performAddition(int a,int b)
		{
			int sum=a+b;
			System.out.println(sum);
			return sum;
		}
		

	}


