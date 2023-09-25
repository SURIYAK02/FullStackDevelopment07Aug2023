package com.gentech.polymorphism;

abstract class Movie
{
	void play()
	{
		System.out.println("Playing a Generic Movie");
	}
}

class ActionMovie extends Movie
{   
	void play() 
	{
		System.out.println("KGF Action Movie");
	}
}

class ComedyMovie extends Movie 
{
	void play() 
	{
		System.out.println("victory Comedy Movie");
	}
}

class DramaMovie extends Movie 
{
	void play()
	{
		System.out.println("Jolly days Drama Movie");
	}
}

public class Assign5poly{
	public static void main(String[]args) {
		Movie actionMovie=new ActionMovie();
		Movie comedyMovie=new ComedyMovie();
		Movie dramaMovie=new DramaMovie();
		
		actionMovie.play();
		comedyMovie.play();
		dramaMovie.play();
	}
}




