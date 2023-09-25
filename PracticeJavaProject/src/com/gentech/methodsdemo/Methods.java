package com.gentech.methodsdemo;

public class Methods {

	public static void main(String[] args) 
	{
		byte b[] = {1,2,3,4,5,6};
		short s[] =  {1,2,3,4,5,6,7,8};
		int i[] = {1,2,3,4,5,6,7,8};
		char ch[] = {'a','e','z','t','j'};
		String st[] = {"abc","cba","cab"};
		int x[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int y[][] = {{9,8,7},{6,5,4},{3,2,1}};
		String str[][] = {{"abc","cba","cab"},{"xyz","yzx","xzy"},{"ijk","jki","ikj"}};
		assignments obj = new assignments();
		
		obj.bytearray(b);
		obj.shortarray(s);
		obj.intarray(i);
		obj.chararray(ch);
		obj.stringarray(st);
		obj.onedarraysum(i);
		obj.charvowel(ch);
		obj.int2darray(x);
		obj.int2dsumarray(y);
		obj.subtract(x, y);
		obj.squarearray(i);
		obj.concatstring(str);
		
	}

}

class assignments
{
	//byte array read 2nd half of the element
	void bytearray(byte[] a)
	{	
		System.out.println("Assignment 1");
		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
	}
	
	// 1D array read 2st half of the element
	void shortarray(short s[])
	{
		System.out.println("Assignment 2");
		for(int i=s.length/2;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
		System.out.println();
	}
	
	//1D integer array read the 1st of the element in reverse order
	void intarray(int a[])
	{
		System.out.println("Assignment 3");
		for(int i=a.length/2-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
	}
	
	//1D character array 
	void chararray(char ch[])
	{
		String c="";
		System.out.println("Assignment 4");
		for(int i=0;i<ch.length;i++)
		{
			c=c+ch[i];
		}
		System.out.println(c);
		System.out.println();
		System.out.println();
	}
	
	//1D String array read the element
	void stringarray(String s[])
	{
		System.out.println("Assignment 5");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+",");
		}
		System.out.println();
		System.out.println();
	}
	
	//1D integer array find the sum of all element
	void onedarraysum(int a[])
	{
		int sum = 0;
		System.out.println("Assignment 6");
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.println();
	}
	
	//1D character array display vowels seperately
	void charvowel(char c[])
	{
		System.out.println("Assignment 7");
		for(int i=0;i<c.length;i++)
		{
			char ch = c[i];
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
			{
				System.out.print(ch+", ");
			}
		}
		System.out.println();
		System.out.println();
	}
	
	//2D 3*3 integer array read last row of the elements
	void int2darray(int x[][])
	{
		System.out.println("Assignment 8");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[2][i]+" ");
		}
		System.out.println();
		System.out.println();
	}
	
	//2D 3*3 integer array find the sum of elements of first row
	void int2dsumarray(int a[][])
	{
		System.out.println("Assignment 9");
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[0][i];
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.println();
	}
	
	//sub of 2 matrix & result in reverse order
	void subtract(int a[][],int b[][])
	{
		System.out.println("Assignment 10");
		int res[][] = new int[a.length][a[0].length];
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[0].length;j++)
			{
				res[i][j] = a[i][j] - b[i][j];
			}
		}
		
		for(int i = a.length-1;i>=0;i--)
		{
			for(int j = a[0].length-1;j>=0;j--)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	//1D integer array square of each elements
	void squarearray(int x[])
	{
		System.out.println("Assignment 11");
		int sum = 0;
		for(int i=0;i<x.length;i++)
		{
			sum = sum + (x[i]*x[i]);
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.println();
	}
	
	//2D string array 
	void concatstring(String str[][])
	{
		String s=" ";
		System.out.println("Assignment 12");
		for(int i = 0;i<str.length;i++)
		{
			for(int j = 0;j<str[0].length;j++)
			{
				s=s+str[i][j];
			}
			System.out.println(s);
		}
		System.out.println();
		System.out.println();
	}
}

