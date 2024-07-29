package com.lambdas;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,String> convertStr= (input)-> input.toUpperCase();
		System.out.println(convertStr.apply("Nishant"));

		
		Function<String,Integer> getLength= (input)-> input.length();
		System.out.println(getLength.apply("Nishant"));

		
		Function<String,String> sameValue = Function.identity();
		System.out.println(sameValue.apply("Om Namah Shivay"));
	
	     
		Function<Integer,Integer> doubleValue = num -> num*2 ;
		Function<Integer,Integer> addThree = num -> num+3 ;
		
		Function<Integer,Integer> op1 = doubleValue.andThen(addThree);
		Function<Integer,Integer> op2 = doubleValue.compose(addThree);
		
		System.out.println(op1.apply(5)); //L---R execution
		System.out.println(op2.apply(5)); //R---L execution
		
		
	
		
		
	
	
	}
	

}
