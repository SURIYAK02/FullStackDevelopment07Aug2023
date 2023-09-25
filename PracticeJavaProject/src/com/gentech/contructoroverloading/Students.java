package com.gentech.contructoroverloading;


class Student {
	String name;
	int Student_Id;
	String Student_Branch;

	Student(String n, int id) {
		name = n;
		Student_Id = id;
		System.out.println("Order Name : " + name);
		System.out.println("Order code : " + Student_Id);
	}

	Student() {

	}

	Student(String sb) {
		Student_Branch = sb;
		System.out.println("Order_Price : " + Student_Branch);

	}
}

public class Students {

	public static void main(String[] args) {

		Student obj = new Student("Suriya", 471910012);
		Student obj2 = new Student("B.E");
	}	
}




