package com.gentech.abstractdemo;

abstract class AbstractNoArgs
{
	AbstractNoArgs()
	{
		System.out.println("No Argument Constructor Block From Abstract Class");
	}
}
class a3 extends AbstractNoArgs
{
	
}

public class Assign3 {

	public static void main(String[] args) {

		a3 obj = new a3();
	}
}