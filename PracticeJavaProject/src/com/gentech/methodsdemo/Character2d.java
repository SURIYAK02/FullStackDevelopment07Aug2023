package com.gentech.methodsdemo;

public class Character2d {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 9, 8, 4 } };
		int x[] = { 1,2,3,4,5,6};
		assignment obj = new assignment();
		obj.vowel('a');
		obj.reverse(a);
		obj.onearray(x);
		obj.anddemo(9,8);
		obj.ordemo('i');
		obj.notdemo(7, 9);
		obj.fordemo(0);
	}
}

class assignment {
	void vowel(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("It is Vowel");
		} else {
			System.out.println("It is not a vowel");
		}
	}

	void reverse(int a[][]) {
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = a[0].length - 1; j >= 0; j--) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}

	void onearray(int x[]) {
		int a[] = new int[x.length];
		int c = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			a[c] = x[i];
			c++;
		}
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println(a[i]);
		}
	}
	void anddemo(int x,int y)
	{
		if(x>y && y!=x) {
			System.out.println(x+"is greater");
		}
		else
		{
			System.out.println(y+"is greater");
			
		}
	}
	void ordemo(char ch) {
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
		{
			System.out.println("It is Alphabet");
		}
		else
		{
			System.out.println("It is not a Alphabet");
		}
	}
	void notdemo(int x,int y)
	{
		if(x!=y && y!=x) {
			System.out.println(x+"is equal");
		}
		else
		{
			System.out.println(y+"is not equal");
		}
	}
	void fordemo(int sum)
	{
		
		for(int i=50;i<=100;i++)
		{
			if(i%2==1) 
			{
				sum=sum+i;	
			}	
		}
		System.out.println("The sum of odd number 50 to 100 is:"+sum);
	}
}
