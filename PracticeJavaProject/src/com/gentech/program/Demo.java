package com.gentech.program;

public class Demo {

	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		int sum=0;
		if((i>=0)&&(i<=100)) {
			sum=sum+i;
			System.out.println("1.00Rs");
		}
		else if((i>100)&&(i<=200)) {
			System.out.println("1.50Rs");
		}
		else {
			System.out.println("2.50Rs");
		}
	
		}
		
	}



