package com.gentech.looping;

public class Cubewhile {

	public static void main(String[] args) {
		int cube=0;
		int i=1;
		while(i<=10)
		{
			cube=cube+(i*i*i);
			i++;
		}
		System.out.println(cube);
	}

}
