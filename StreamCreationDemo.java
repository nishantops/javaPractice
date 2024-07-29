package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationDemo {

	public static void main(String[] args) {


		List<String> departmentList = new ArrayList();
		 
		departmentList.add("Supply");
		departmentList.add("HR");
		departmentList.add("Sales");
		departmentList.add("Marketing");

		Stream<String>depStream = departmentList.parallelStream();
		//depStream.forEach(department->System.out.println(department));
		depStream.forEach(System.out::println);
		
		Stream<String> inStream = Stream.of("My","Eclipse","Java");
		inStream.forEach(System.out::println);
		
		Stream<String> dep1Stream = departmentList.stream();
		//depStream.forEach(department->System.out.println(department));
		dep1Stream.forEach(System.out::println);
		
		String[] arrayOfWords = {"My","Eclipse"};
		Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
		
		//infinite stream of elements
		
		/*Approach 1 */
		// Stream.generate(new Random()::nextInt).forEach(System.out::println);
		
		 /*Approach 2 */
		 Stream.iterate(1,n->n+1).forEach(System.out::println);
		
	}

}
