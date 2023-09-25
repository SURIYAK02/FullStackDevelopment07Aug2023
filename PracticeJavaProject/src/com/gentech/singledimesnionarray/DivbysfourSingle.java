package com.gentech.singledimesnionarray;

public class DivbysfourSingle {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i>=50;i--)
		{
			if(i%4==0)
			{	
				count=count+1;
			}
		}
		System.out.println("the number of count "+count);
		int x[]=new int[count];
		int k=0;
		for(int j=100;j>=50;j--)
		{

			if(j%4==0)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=x.length-1;z>=0;z--)
		{
			System.out.println("the reverse order is  "+x[z]);
		}

	}

}
