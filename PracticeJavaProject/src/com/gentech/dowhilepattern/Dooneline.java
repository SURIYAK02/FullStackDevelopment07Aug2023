/*
 1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 */

package com.gentech.dowhilepattern;

public class Dooneline {

	public static void main(String[] args) {
		int num=1;
		int i=1;
		do {
			int k=1;
			do {
				System.out.print(num+" ");
				num++;
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
