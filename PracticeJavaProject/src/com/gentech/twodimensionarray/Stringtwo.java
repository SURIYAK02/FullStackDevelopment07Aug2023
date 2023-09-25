package com.gentech.twodimensionarray;

public class Stringtwo {

	public static void main(String[] args) {
		String str[][]= {{"hi","welcome","bangaloru"},
				{"2D","3D","4D"},
				{"vfx","gfx","ffs"}};
		for(int i=str.length-1;i>=0;i--)
		{
			for(int j=str[i].length-1;j>=0;j--)
			{
			   System.out.print(str[i][j]+" ");	
			}
			System.out.println();
		}
	}
	}


