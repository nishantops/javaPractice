package com.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {

      Predicate<Integer> isEven= (num1)-> (num1%2==0);
      Predicate<Integer> isGreaterThan50 = (num1)-> (num1>50);
      System.out.println(isEven.test(16));
      System.out.println(isEven.test(13));
      
      //Multiple Predicate - >50 and even
      
      System.out.println(isEven.and(isGreaterThan50).test(57));
      
    //Multiple Predicate - >50 OR even
      
      System.out.println(isEven.or(isGreaterThan50).test(48));
      
      //Negate
      System.out.println(isEven.negate().test(63));
      
      //NOT
      
      Predicate<Integer> isOdd = Predicate.not(isEven);
      System.out.println(isOdd.test(33));
      
      //Equals
      
      Predicate<String> checkEquality = Predicate.isEqual("Eazy Bytes");
      System.out.println(checkEquality.test("Nishant"));
      
      List<Integer> list = Arrays.asList(12,13,14,15,16);
      List<Integer> list1 = list.stream().filter(isEven).collect(Collectors.toList());
      System.out.println(list1);
      

	}

}
