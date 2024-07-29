package com.lambdas;

public class LexcialScopingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World";
		Printer printer=input1 -> System.out.println(input1); //Method Scoping-- like method,doesn't have  
         printer.print(input);
         
         
 		Printer printer1 =input2 -> System.out.println(input2);
 		String input2 = "Damn World";
 		printer.print(input2);
	}

}
