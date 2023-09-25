package com.gentech.contructoroverloading;

class Colleges {
	String name;
	int college_code;
	String university_under;

	Colleges(String n, int cc) {
		name = n;
		college_code = cc;
		System.out.println("College Name : " + name);
		System.out.println("College code : " + college_code);
	}

	Colleges(String uu) {
		university_under = uu;
		System.out.println("Collge Under University : " + university_under);

	}

	Colleges() {

	}
}

public class College {
	public static void main(String[] args) {
		Colleges obj = new Colleges("Anna University", 997856);
		Colleges obj2 = new Colleges("University");
	}

}
