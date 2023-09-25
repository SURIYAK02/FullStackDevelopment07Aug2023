/*
2 
2 2 
2 2 2 
2 2 2 2 
2 2 2 2 2 
*/
package com.gentech.dowhilepattern;

public class Dotwotwo {

	public static void main(String[] args) {
		int i=2;
		 do{
			int k=2;
			do{
				System.out.print("2 ");
				k++;
			}while(k<=i); 
			System.out.println();
			i++;
		}while(i<=6);

	}

}
