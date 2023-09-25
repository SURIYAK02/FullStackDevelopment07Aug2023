package com.gentech.inheritance;

class Fifth1 {
	Fifth1(String name) {
		System.out.println("Super Class name : " + name);
	}
}

class Fifth2 extends Fifth1{
	Fifth2(String name) {
		super(name);
		System.out.println("Child Class of parent class");
	}
}

class Fifth3 extends Fifth2 {
	Fifth3(String name) {
		super(name);
		System.out.println("Child Class of child class 1 ");
	}
}
class Fifth4 extends Fifth3 {
	Fifth4(String name) {
		super(name);
		System.out.println("Child Class of child class 2 ");
	}
}
public class MulltiLevelFifth {

	public static void main(String[] args) {
		Fifth4 obj = new Fifth4("Suriya");
	}
}

