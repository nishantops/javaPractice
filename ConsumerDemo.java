  package com.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> convertAndDisplay = input-> System.out.println(input.toUpperCase());
		convertAndDisplay.accept("Nishant");
		
		Consumer<Integer> squareOf = num -> System.out.println(num*num);
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.forEach(squareOf);
		
		Consumer<String> appendInput = input -> System.out.println("New value after appending is :Hello " + input);
		appendInput.andThen(convertAndDisplay).accept("Lambda expression");

	}

}
