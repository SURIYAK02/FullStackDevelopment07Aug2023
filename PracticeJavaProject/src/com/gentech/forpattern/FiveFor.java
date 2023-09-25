/*
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
 */

package com.gentech.forpattern;

public class FiveFor {

	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				num=num+5;
				System.out.print(num+" ");

			}
			System.out.println();
		}
	}

}
