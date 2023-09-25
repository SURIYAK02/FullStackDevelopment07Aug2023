package com.gentech.program;

public class PositiveNegative {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num>0) {
			System.out.println(num+" is a Positive Number");
		}
		else if(num<0) {
			System.out.println(num+" is a Negative Number");
		}
		else {
			System.out.println(num+" is a Neutral");
		}
    
	}

}
