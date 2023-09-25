package com.gentech.inheritance;

class Maths1{
	void add(int i) {
		for( i=100;i<=200;i++)
		{
			if(i%4==0)
			{
				System.out.println(i);
				
			}
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}
}
class Maths2 extends Maths1{
	void subs(int i) {
		for( i=150;i>=50;i--)
		{
			if(i%6==0)
			{
				System.out.println(i);
			}
		}
	}
}

public class SimpleInheritance {

	public static void main(String[] args) {
		Maths2 o=new Maths2();
		o.add(35);
		o.subs(9);
	}
}
