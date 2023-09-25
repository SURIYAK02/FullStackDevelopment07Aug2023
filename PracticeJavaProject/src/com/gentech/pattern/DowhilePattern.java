package com.gentech.pattern;

public class DowhilePattern {

	public static void main(String[] args) {
		int i=1;
		do {
			int k=1;
			do {
				System.out.print("#");
				k++;
			}while(k<=6);
			i++;
			System.out.println();
		}while(i<=3);

	}

}
