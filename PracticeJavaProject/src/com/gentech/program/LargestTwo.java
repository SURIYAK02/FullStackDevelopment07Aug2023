package com.gentech.program;

public class LargestTwo {

	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		if(num1>num2) {
			System.out.println(num1+" is a greater number");
		}
		else if(num2>num1) {
			System.out.println(num2+" is a greater number");
		}
		else {
			System.out.println("Both are equal");
		}
			
		
 
	}

}
