package com.lambdas;

public class InstanceMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       var op1= new InstanceMethodRef();
       ArithmeticOperations ops = op1::performMultiply;
       ops.operation(2, 3);
	}

	public int performMultiply(int a,int b)
	{
		int multiple=a*b;
		System.out.println(multiple);
		return multiple;
	}
}
