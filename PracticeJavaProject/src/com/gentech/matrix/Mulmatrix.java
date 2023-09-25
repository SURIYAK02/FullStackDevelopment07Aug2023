package com.gentech.matrix;

import java.util.*;

public class Mulmatrix {

	public static void main(String[] args) {
		int a[][] = {{9, 2, 3}, {4, 5, 6}};
		int b[][] = {{9, 8}, {9, 10}, {11, 12}};

	
		int aRows = a.length;
		int aCols = a[0].length;
		int bRows = b.length;
		int bCols = b[0].length;
		
		if(aRows == bCols) {
			int c[][] = new int[aRows][bCols];
			for(int i=0; i<aRows; i++) {
				for(int j=0; j<bCols; j++) {
					for(int k=0; k<aCols; k++) {
						c[i][j]+= a[i][k] * b[k][j];
					}
				}
			}
			System.out.println(Arrays.deepToString(c));
		}else {
			System.out.println("Can't perform Matrix Multiplication.");
		}
	}
}
