package com.lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		UnaryOperator<String> convertStr= (input)-> input.toUpperCase();
		System.out.println(convertStr.apply("Nishant"));

		
		UnaryOperator<String> sameValue = UnaryOperator.identity();
		System.out.println(sameValue.apply("Om Namah Shivay"));
	
	     
		UnaryOperator<Integer> doubleValue = num -> num*2 ;
		UnaryOperator<Integer> addThree = num -> num+3 ;
		
		Function<Integer,Integer> op1 = doubleValue.andThen(addThree); // No need of change as addThen and Compose has a return type of Function.
		Function<Integer,Integer> op2 = doubleValue.compose(addThree);
		
		System.out.println(op1.apply(5)); //L---R execution
		System.out.println(op2.apply(5)); //R---L execution
		
		
	
		

	}

}
