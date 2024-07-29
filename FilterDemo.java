package com.streams;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

	
	public static void main(String[] args) {
		
		List<String> departmentList = new ArrayList();
		 
		departmentList.add("Supply");
		departmentList.add("HR");
		departmentList.add("Sales");
		departmentList.add("Marketing");
		
		departmentList.stream().map(word -> word.toUpperCase()).
				filter(dept -> dept.startsWith("S")).forEach(System.out::println);
		
	}
}
