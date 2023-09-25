package com.gentech.methodsdemo;
class Vowel{
	void vowel(char ch)
	{
		
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
			{
				System.out.println("It is Vowel");
			}
			else
			{
				System.out.println("It is not a vowel");
			}
	}
}
public class OvalorNot {

	public static void main(String[] args) {
		Vowel v=new Vowel();
		v.vowel('e');
		v.vowel('p');
		v.vowel('k');
	}
}
