package com.lambdas;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArithmeticOperations addition=(a,b)-> a+b; 
		ArithmeticOperations subtraction=(a,b)-> a-b; 
		ArithmeticOperations multiplication=(a,b)-> a*b; 
		ArithmeticOperations division=(a,b)-> a/b; 
		
        operate(addition);
        operate(subtraction);
        operate(multiplication);
        operate(division);
		
		//		Hello h = ()-> System.out.println("Hello");    
//		Hello h1 = ()-> System.out.println("Hello World");
//        process(h);
//        process(h1); // Approach 1
//        
//        process(()-> System.out.println("Hi")); // Approach 2
	}
	
	public static void process(Hello h)
	{
		h.sayHello();
	}
	
	
	public static void operate(ArithmeticOperations a)
	{
		System.out.println(a.operation(6, 2));
	}
	
	

}
