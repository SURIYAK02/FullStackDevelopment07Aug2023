package com.gentech.inheritance;


class Sixth1 {
	String names;
	int rollno;
	int mobilenum;

	Sixth1(String name, int r, int cc) {
		names = name;
		rollno = r;
		mobilenum = cc;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + mobilenum);
	}
}

class Sixth2 extends Sixth1 {
	String names;
	int rollno;
	int mobilenum;

	Sixth2(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		mobilenum = cc;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + mobilenum);
	}
}

class Sixth3 extends Sixth2 {
	String names = "";
	int rollno;
	int mobilenum;

	Sixth3(String name,int r,int cc)
	{
		super(name,r,cc);
		names = name;
		rollno = r;
		mobilenum = cc;
		System.out.println("Child Class 2 name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " +mobilenum);
	}
}

public class MultiLevel6 {

	public static void main(String[] args) {
		Sixth3 obj=new Sixth3("Suriya",18,87654);
	}
}

