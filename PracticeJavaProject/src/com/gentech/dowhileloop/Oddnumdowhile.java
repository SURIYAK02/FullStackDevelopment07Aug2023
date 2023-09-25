package com.gentech.dowhileloop;

public class Oddnumdowhile {

	public static void main(String[] args) {
		int i=50;
		int sum=0;
		do
		{
			if(i%2==1) {
				sum=sum+i;
			}
			i++;
		}while(i<100);
		System.out.println("The sum of odd number 50 to 100 is:"+sum);
	}
}
