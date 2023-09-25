package com.gentech.inheritance;

class Eight1 {
	String names;
	int rollno;
	int pincode;

	Eight1(String name, int r, int cc) {
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class Eight2 extends Eight1 {
	String names;
	int rollno;
	int pincode;

	Eight2(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class Eight3 extends Eight2 {
	String names = "";
	int rollno;
	int pincode;

	Eight3(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class Eight4 extends Eight1 {
	String names = "";
	int rollno;   
	int pincode;

	Eight4(String name,int r,int cc)
	{
		super(name,r,cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 3(simple) name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " + pincode);
	}
}

public class HybridInheritance8 {

	public static void main(String[] args) {
		Eight3 obj = new Eight3("Balaji", 84, 560072);
		Eight4 obj2 = new Eight4("Suriya",18,876543);
		
	}
}

