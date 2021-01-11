package com.app;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {
	public static void main(String[]args) {
		List<Product>productList = new ArrayList<>();
		
		productList.add(new Product(100, "TV",100.11,4.2f,true));
		productList.add(new Product(200, "TV",200.11,4.7f,false));
		productList.add(new Product(300, "TV",300.11,4.2f,true));
		productList.add(new Product(400, "TV",400.11,3.2f,false));
		productList.add(new Product(500, "TV",500.11,4.76f,true));
		productList.add(new Product(600, "TV",600.11,2.2f,true));
		productList.add(new Product(700, "TV",700.11,2.2f,true));
		
		printProducts(productList);
		
	}
	
	public static void printProducts(List<Product> productList) {
		for(Product p:productList) {
			System.out.println(p);
		}
	}
}
