package com.gentech.polymorphism;

public class Assign3poly
{

	public static void main(String[] args) 
	{
		Animal r = null;
		
		Elephant a = new Elephant();
		Dog m = new Dog();
		cat o = new cat();
		
		r = a;
		r.AvgWeight();
		
		r=m;
		r.AvgWeight();
		
		r=o;
		r.AvgWeight();
	}
}
abstract class Animal
{
    abstract void AvgWeight();
}

class Elephant extends Animal 
{
    void AvgWeight()
    {
        String Name = "Elephant";
        int weight = 1000;
        System.out.println("Animal name: " + Name);
        System.out.println("Average Weight : "+weight+" Kg");
        System.out.println();
    }
}

class Dog extends Animal 
{
	void AvgWeight()
    {
        String Name = "Dog";
        int weight = 20;
        System.out.println("Animal name: " + Name);
        System.out.println("Average Weight : "+weight+" Kg");
        System.out.println();
    }
}

class cat extends Animal{
	void AvgWeight() {
		String Name="cat";
		int weight=10;
		System.out.println("Animal Name:"+Name);
		System.out.println("Average Weight:"+weight+"kg");
		System.out.println();
	}
}


