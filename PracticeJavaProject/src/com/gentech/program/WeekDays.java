package com.gentech.program;

public class WeekDays {

	public static void main(String[] args) {
		int weekday = Integer.parseInt(args[0]);

        if (weekday==1) {
          
                System.out.println( "monday");
        }
        else if(weekday==2)
        {
                System.out.println( "tuesday");
        }
        else if(weekday==3)
        {
                System.out.println("wednesday");
        }
        else if(weekday==4)
        {
                System.out.println("thuursday");
	}
        else if(weekday==5)
        {
                System.out.println("friday");
        }           
        else if(weekday==6)
        {
               System.out.println("saturday");
        }
        else if(weekday==7)
        {
                System.out.println("sunday");
        }

	}

}
