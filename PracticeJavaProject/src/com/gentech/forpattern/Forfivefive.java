/*
 5 5 5 5 5 
5 5 5 5 
5 5 5 
5 5 
5 
*/

package com.gentech.forpattern;

public class Forfivefive {

	public static void main(String[] args) {

			for(int i=5; i>=1; i--) {
				for(int k=1; k<=i; k++) {
					System.out.print("5 ");
				}
				System.out.println();
			}

	}

}
