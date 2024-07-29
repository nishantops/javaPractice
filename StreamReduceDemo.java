package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class StreamReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> departmentList = new ArrayList();
		 
		departmentList.add("Supply");
		departmentList.add("HR");
		departmentList.add("Sales");
		departmentList.add("Marketing");
		
		System.out.println(departmentList.stream().count());

         List<Integer> numbers = List.of(1,2,3,4,5);
         int sum = numbers.stream().reduce(0,Integer::sum);
         System.out.println(sum);
         
         int result = numbers.stream().mapToInt(num->num).sum();
         System.out.println(result);
         
		
		int res = numbers.stream().mapToInt(num->num).filter(num-> num%2==0).sum();
		System.out.println(res);
		
		OptionalInt res1 = numbers.stream().mapToInt(num->num).filter(num-> num%2==0).max();
		System.out.println(res1.getAsInt());
		
		
	}

}
