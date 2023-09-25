package com.gentech.inheritance;

class mango {
	String str;

	void show() {
		System.out.println("The Value of Parent class:" + str);
	}
}

class orange extends mango {
	String str;

	orange(String s1, String s2) {
		super.str = s1;
		this.str = s2;
	}

	void show2() {
		System.out.println("The Value of sub class:" + str);
	}

}

class grape extends orange {
	String str;

	grape(String s1, String s2, String s3) {
		super(s1, s2);
		this.str = s3;
	}

	void show3() {
		System.out.println("The Value of Second sub class:" + str);
	}

}

public class Assignment2 {
	public static void main(String[] args) {
		grape o = new grape("Apple", "Banana", "Grape");
		o.show();
		o.show2();
		o.show3();
	}
}



