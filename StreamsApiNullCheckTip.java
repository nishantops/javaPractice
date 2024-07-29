package com.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamsApiNullCheckTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		// using Of method - building immutable list object
		//List<String> countryNames = List.of("USA","India",null,"Canada",null,"UK",null,null,"Germany");

		List<String> countryNames = Arrays.asList("USA","India",null,"Canada",null,"UK",null,null,"Germany");
	      
		countryNames.stream().filter(Objects::nonNull).map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
	}

}
