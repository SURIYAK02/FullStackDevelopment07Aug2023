package com.gentech.inheritance;


class Seventh1 {
	String names;
	int rollno;
	int mobilenum;
	String fathername;

	Seventh1(String name, int r,String f) {
		names = name;
		rollno = r;
		fathername=f;

		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);

	}

	Seventh1(int cc) {
		mobilenum = cc;
		System.out.println("Super Class College Code : " + mobilenum);
	}
}

class Seventh2 extends Seventh1 {
	String names;
	int rollno;
	int mobilenum;
	String fathername;


	Seventh2(String name, int r,String f) {
		super(name, r,f);
		names = name;
		rollno = r;
		fathername=f;
		
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);
	}

	Seventh2(int cc) {
		super(cc);
		mobilenum = cc;
		System.out.println("Child class 1 College Code : " + mobilenum);
	}
}

class Seventh3 extends Seventh2 {
	String names = "";
	int rollno;
	int mobilenum;
	String fathername;

	Seventh3(String name, int r,String f) {
		super(name, r,f);
		names = name;
		rollno = r;
		fathername=f;
		
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);
	}

	Seventh3(int cc)
	{
		super(cc);
		mobilenum = cc;
		System.out.println("Child Class 2 College Code : " +mobilenum);
	}
}

public class MultiLevel7 {

	public static void main(String[] args) {
		Seventh3 obj = new Seventh3("Virat", 46,"Kohli");
		Seventh3 obj2 = new Seventh3(560098);

	}
}

