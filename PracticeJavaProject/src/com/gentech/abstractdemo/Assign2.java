package com.gentech.abstractdemo;

abstract class AbstractStatic
{
	static 
	{
		System.out.println("Static Block From Abstract Class");
	}
}

class Abstract2 extends AbstractStatic{
	
}

public class Assign2  {

	public static void main(String[] args) {
		Abstract2 o = new Abstract2();
	}
}