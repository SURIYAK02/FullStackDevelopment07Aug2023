package com.gentech.program;

public class EvenNum {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		
	//	 int num=45;
        
        if(num%2==0) {
        	System.out.println(num+"is a Even Number");
        }
        else {
        	System.out.println(num+"is a Odd Number");
        }
	}

}
