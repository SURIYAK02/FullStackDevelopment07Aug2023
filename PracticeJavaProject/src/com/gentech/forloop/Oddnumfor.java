package com.gentech.forloop;

public class Oddnumfor {

	public static void main(String[] args) {
		int sum=0;
		for(int i=50;i<=100;i++)
		{
			if(i%2==1) 
			{
				sum=sum+i;	
			}	
		}
		System.out.println("The sum of odd number 50 to 100 is:"+sum);
	}
}
