package com.gentech.noargsconstructor;

class Student
{
	String StudentFirstName;
	int age;
	int id;
	String branch;
	Student(){
		StudentFirstName="Guna";
		age=21;
		id=4707;
		branch="Engineering";
		System.out.println("StudentFirstName:"+StudentFirstName);
		System.out.println("Age:"+age);
		System.out.println("id:"+id);
		System.out.println("branch;"+branch);
		System.out.println("----------------------");
	}
}  

class Library
{
	String LibraryType;
	String LibraryName;
	int id;
	String Location;
	Library(){
		LibraryType="Government";
		LibraryName="Tamil";
		id=9080;
		Location="Kanchipuram";

		System.out.println("LibraryName:"+LibraryName);
		System.out.println("LibraryType="+LibraryType);
		System.out.println("id:"+id);
		System.out.println("Location:"+Location);
		System.out.println("-----------------------");
	}
}

class Sports
{
	String SportsName;
	String SportsSponser;
	String PlayerName;
	int Jersyid;
	Sports(){
		SportsName="Cricket";
		SportsSponser=("Addidas");
		PlayerName="Virat Kolhi";
		Jersyid=18;
		System.out.println("SportsName:"+SportsName);
		System.out.println("SportsSponser:"+SportsSponser);
		System.out.println("PlayerName:"+PlayerName);
		System.out.println("Jersyid:"+Jersyid);
	}
}

public class StuLibSpt {

	public static void main(String[] args) {
		Student Guna= new Student();
		
		Library Lib=new Library();
		
		Sports Sp= new Sports();
	}
}
