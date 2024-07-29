package com.lambdas;

import java.util.List;

public class ClassMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       var list = List.of("Supply","HR","Sales","Marketing");
       list.forEach(department->System.out.println(department));
	   list.forEach(System.out::println);
	}

}
