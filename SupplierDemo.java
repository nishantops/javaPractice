package com.lambdas;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<Integer> getCurrentMonth = ()->LocalDate.now().getDayOfMonth();
		System.out.println(getCurrentMonth.get());
		
		Supplier<String> getCurrentDayOfMonth = ()->LocalDate.now().getDayOfWeek().name();
		System.out.println(getCurrentDayOfMonth.get());
	}

}
