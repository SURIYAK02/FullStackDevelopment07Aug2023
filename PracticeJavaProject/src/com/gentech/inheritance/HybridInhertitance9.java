package com.gentech.inheritance;


class Ninth1 {
	String names;
	int rollno;
	int pincode;

	Ninth1(String name, int r) {
		names = name;
		rollno = r;

		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	Ninth1(int cc) {
		pincode = cc;
		System.out.println("Super Class College Code : " + pincode);
	}
}

class Ninth2 extends Ninth1 {
	String names;
	int rollno;
	int pincode;

	Ninth2(String name, int r) {
		super(name, r);
		names = name;
		rollno = r;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	Ninth2(int cc) {
		super(cc);
		pincode = cc;
		System.out.println("Child class 1 College Code : " + pincode);
	}
}

class Ninth3 extends Ninth2 {
	String names = "";
	int rollno;
	int pincode;

	Ninth3(String name, int r) {
		super(name, r);
		names = name;
		rollno = r;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	Ninth3(int cc) {
		super(cc);
		pincode = cc;
		System.out.println("Child Class 2 College Code : " + pincode);
	}
}

class Ninth4 extends Ninth1 {
	String names = "";
	int rollno;
	int pincode;

	Ninth4(String name, int r) {
		super(name, r);
		names = name;
		rollno = r;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	Ninth4(int cc)
	{
		super(cc);
		pincode = cc;
		System.out.println("Child Class 2 College Code : " +pincode);
	}
}

public class HybridInhertitance9 {

	public static void main(String[] args) {
		Ninth3 obj = new Ninth3("sadhish", 24);
		System.out.println();
		System.out.println();
		
		Ninth3 obj2 = new Ninth3(560075);
		System.out.println();
		System.out.println();
		
		Ninth4 obj3 = new Ninth4("santosh", 11);
		System.out.println();
		System.out.println();
		
		Ninth4 obj4 = new Ninth4(560098);
	}
}

