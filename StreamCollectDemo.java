package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> departmentList = new ArrayList();
		 
		departmentList.add("Supply");
		departmentList.add("HR");
		departmentList.add("Sales");
		departmentList.add("Marketing");
		
		List<String> newdeptList =departmentList.stream().filter(dept->dept.startsWith("S")).collect(Collectors.toList());
		newdeptList.forEach(System.out::println);
		
		long noOfdeptList =departmentList.stream().filter(dept->dept.startsWith("S")).collect(Collectors.counting());
		System.out.println(noOfdeptList);
		
		Set<String> newdeptLis =departmentList.stream().filter(dept->dept.startsWith("S")).collect(Collectors.toSet());
		newdeptLis.forEach(System.out::println);
		
		
		Set<String> newdeptList1 =departmentList.stream().filter(dept->dept.startsWith("S")).collect(Collectors.toCollection(TreeSet::new));
		newdeptList1.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
	}

}
