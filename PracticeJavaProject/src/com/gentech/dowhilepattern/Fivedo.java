/*
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
 */
package com.gentech.dowhilepattern;

public class Fivedo {

	public static void main(String[] args) {
		int num=0;
		int i=1;
		do{
			int k=1;
			do {
				num=num+5;
				System.out.print(num+" ");
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
