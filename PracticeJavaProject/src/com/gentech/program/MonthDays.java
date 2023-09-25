package com.gentech.program;

public class MonthDays {

	public static void main(String[] args) {
		int monthnum = Integer.parseInt(args[0]);

		if (monthnum==1) {

			System.out.println( "january");
		}
		else if(monthnum==2)
		{
			System.out.println( "febrauary");
		}
		else if(monthnum==3)
		{
			System.out.println("march");
		}
		else if(monthnum==4)
		{
			System.out.println("april");
		}
		else if(monthnum==5)
		{
			System.out.println("may");
		}           
		else if(monthnum==6)
		{
			System.out.println("june");
		}
		else if(monthnum==7)
		{
			System.out.println("july");
		}
		else if(monthnum==8)
		{
			System.out.println("august");
		}
		else if(monthnum==9)
		{
			System.out.println("septmber");
		}
		else if(monthnum==10)
		{
			System.out.println("octobar");
		}
		else if(monthnum==11)
		{
			System.out.println("november");
		}
		else if(monthnum==12)
		{
			System.out.println("december");
		}
		else {
			System.out.println("Invalid Month");

		}
	}
}
