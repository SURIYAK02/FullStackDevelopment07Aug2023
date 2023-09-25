/*
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
 */

package com.gentech.whilepattern;

public class Fivewhile {

	public static void main(String[] args) {
		int num=0;
		int i=1;
		while(i<=5){
			int k=1;
			while(k<=i) {
				num=num+5;
				System.out.print(num+" ");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
