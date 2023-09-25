package com.gentech.program;

public class TrafficSignal {

	public static void main(String[] args) {
		String signal=args[0];
			switch(signal)
			{
			case "red":
				System.out.println("Stop the vehical");
				break;
			case "yellow":
				System.out.println("Get ready to go");
				break;
			case "green":
				System.out.println("Lets move");
				break;
				default:
					System.out.println("Their is some issue in signal");
				
	}
	}
}
