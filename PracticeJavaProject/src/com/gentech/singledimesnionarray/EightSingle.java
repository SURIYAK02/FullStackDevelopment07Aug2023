package com.gentech.singledimesnionarray;

public class EightSingle {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10;i++)
		{
			int res=8*i;
			count=count+1;
			System.out.print(+res+" ");
		}
		System.out.println();
		System.out.println("the count of 8th table "+count);

		int res[]=new int[count];
		int k=0;
		for(int j=1;j<=10;j++)
		{
			int m=8*j;
			res[k]=m;
			k++;
		}
		for(int z=0;z<res.length/2;z++)
		{
			System.out.println(res[z]);
		}

	}

}
