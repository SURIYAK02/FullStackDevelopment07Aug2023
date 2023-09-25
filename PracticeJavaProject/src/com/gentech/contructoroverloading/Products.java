package com.gentech.contructoroverloading;

class Product {
	String name;
	int Product_code;
	String Product_Price;

	Product(String n, int pc) {
		name = n;
		Product_code = pc;
		System.out.println("Product Name : " + name);
		System.out.println("Product code : " + Product_code);
	}

	Product(String pc) {
		Product_Price = pc;
		System.out.println("Product_Price : " + Product_Price);

	}

	Product() {

	}

}

public class Products {

	public static void main(String[] args) {

		Product obj = new Product("Tv", 7895);
		Product obj2 = new Product("Washing Machine");
	}

}
