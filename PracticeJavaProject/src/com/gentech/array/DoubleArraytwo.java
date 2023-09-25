package com.gentech.array;

public class DoubleArraytwo {

	public static void main(String[] args) {
		double d[]= {1,2,3,4,5,6};
		for(int i=0;i<d.length; i++) {
			if(d.length/2<d[i])
			System.out.println(d[i]);
		}
	}
}
