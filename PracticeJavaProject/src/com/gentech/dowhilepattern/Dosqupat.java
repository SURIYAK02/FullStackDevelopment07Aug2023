/*
1 
4 9 
16 25 36 
49 64 81 100 
*/
package com.gentech.dowhilepattern;

public class Dosqupat {

	public static void main(String[] args) {
		int b=1;
		int i=1;
		do {
			int k=1;
			do{
				System.out.print(b*b+" ");
				b++;
				k++;
			}while(k<=i); 
			System.out.println();
			i++;
		}while(i<=4);

	}

}
