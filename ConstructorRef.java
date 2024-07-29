package com.lambdas;

public class ConstructorRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ProductInterface productInterface = (name,price)-> new Product(name,price);
      productInterface.getProduct("App Mac", 2000);
      
      ProductInterface constructorRef = Product::new;
      constructorRef.getProduct("Iphone 15", 700);
	
	}

}
