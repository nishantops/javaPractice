package com.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo {

	public static void main(String[] args) {
		
		
      Optional<String> msg = sayHi();
      if (msg.isPresent())
      System.out.println(msg.get().toUpperCase());
       msg.ifPresent(message-> System.out.println(message.toUpperCase()));
       msg.ifPresentOrElse(message-> System.out.println("ifElse "+message.toUpperCase()),()-> System.out.println("Value is absent"));
       
       System.out.println(msg.orElse("Value is not present"));
       System.out.println(msg.orElseGet(()-> "Value unavailable"));
       
       
      //Optional <String> mapStr= msg.map(input -> input.toLowerCase());
      Optional <String> mapStr= msg.map(String::toLowerCase);
      System.out.println(mapStr.get());
       
      Optional <String> mapStr1= msg.filter(value->value.length()>50);
      System.out.println(mapStr1);
       
       
       
       //System.out.println(msg.orElseThrow());
     //  System.out.println(msg.orElseThrow(()-> new IllegalStateException("Value not found")));
       
//		String message = sayHello();
//		if(message!=null)
//		System.out.println(message.toUpperCase());
//				
	}
	
	public static String sayHello() {
		
		int num= new Random().nextInt();
		System.out.println(num);
		if (num%2==0) {
		return "Hello World";
		}
		return null;
	}
	
    public static Optional<String> sayHi() {
		
		int num= new Random().nextInt();
		System.out.println(num);
		String msg=null;
		if (num%2==0)
			msg = "Hi world";
		return Optional.ofNullable(msg);
		//
}}
