package com.gentech.forloop;


class Return1
{
	static int getno(int num)
	{
		int cube;
		cube=(num*num*num);
		return cube;
	}
	static int getno1(int num)
	{
		int cube;
		cube=(num*num*num);
		return cube;
	}
	
}

public class Cubefor {

	public static void main(String[] args) {
	
		//
			System.out.println(Return1.getno(3));
			int a=	Return1.getno1(3);
		System.out.println(" cube :"+a);
		
	}
}
