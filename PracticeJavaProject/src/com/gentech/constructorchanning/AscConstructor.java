package com.gentech.constructorchanning;

public class AscConstructor {

	public static void main(String[] args) {
		int a[]= {10,23,99,900,1,45,32};
		int b;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
		System.out.println("Array in ascending order:");
		for(int k=1;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}

	}

}
