package com.gentech.forloop;

public class Factorialfor {

	public static void main(String[] args) {
		int fact=1;
		int num=5;
			
		//Integer.parseInt(args[0]);
		for(int i=1;i<=num;i++)
		{
				fact=fact*i;
				
		}
		System.out.println(fact);
	}

}
