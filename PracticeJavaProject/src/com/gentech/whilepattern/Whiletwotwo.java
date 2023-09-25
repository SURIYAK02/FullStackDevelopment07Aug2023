/*
2 
2 2 
2 2 2 
2 2 2 2 
2 2 2 2 2 
*/

package com.gentech.whilepattern;

public class Whiletwotwo {

	public static void main(String[] args) {
		int i=2;
		while(i<=6) {
			int k=2;
			while(k<=i) {
				System.out.print("2 ");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
