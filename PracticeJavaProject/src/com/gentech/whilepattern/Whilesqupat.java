/*
1 
4 9 
16 25 36 
49 64 81 100 
*/

package com.gentech.whilepattern;

public class Whilesqupat {

	public static void main(String[] args) {
		int b=1;
		int i=1;
		while(i<=4) {
			int k=1;
			while(k<=i) {
				System.out.print(b*b+" ");
				b++;
				k++;
			}
			System.out.println();
			i++;
		}
	}
}
