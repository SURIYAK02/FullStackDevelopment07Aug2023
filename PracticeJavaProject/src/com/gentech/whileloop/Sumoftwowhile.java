package com.gentech.whileloop;

public class Sumoftwowhile {

	public static void main(String[] args) {
		int sum=0;
		int i=250;
		while(i<=500)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
