package com.gentech.interfacedemo;

interface Sub
{
	public static final int a = 250;
	public static final int b = 100;
	public static final int c = 50;
	void sub2();
}

class Subtraction implements Sub
{
	public void sub2()
	{
		System.out.println("Subtraction:"+(a-b-c));
	}
}

public class AssignVariable2
{

	public static void main(String[] args) 
	{
		Subtraction o = new Subtraction();
		o.sub2();
	}
}


