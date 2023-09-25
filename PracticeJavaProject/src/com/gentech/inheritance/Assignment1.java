package com.gentech.inheritance;

class HOD {
	void staffDetails(String name) {
		System.out.println("HOD Name:" + name);
	}
}

class Staff extends HOD {
	Staff(String name) {

		super.staffDetails(name);
	}

	void staffDetails(String name) {
		System.out.println("Staff Name:" + name);
	}
}

class Student extends Staff {
	Student(String name) {
		super(name);
		super.staffDetails(name);
	}

	void staffDetails(String name) {
		System.out.println("Student name:" + name);
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Student o1 = new Student("aaaa");

		o1.staffDetails("xtyy");
		// o1.studentsDetails("aaa");

	}
}
