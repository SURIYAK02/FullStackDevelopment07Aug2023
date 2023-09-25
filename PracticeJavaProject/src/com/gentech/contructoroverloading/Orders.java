package com.gentech.contructoroverloading;

class Order {
	String name;
	int Order_code;
	String Order_Source;

	Order(String n, int oc) {
		name = n;
		Order_code = oc;
		System.out.println("Order Name : " + name);
		System.out.println("Order code : " + Order_code);
	}

	Order() {

	}

	Order(String os) {
		Order_Source = os;
		System.out.println("Order_Price : " + Order_Source);

	}

}

public class Orders {

	public static void main(String[] args) {

		Order obj = new Order("Dosa", 45);
		Order obj2 = new Order("Zomato");		

	}

}
