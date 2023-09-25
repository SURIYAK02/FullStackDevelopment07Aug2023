package com.gentech.inheritance;

class Student1
{
	String Name;
	void showStudname(String Studname)
	{
		System.out.println("the student name in parent class:"+Studname);
	}
}
class Student2 extends Student1
{
	Student2(String Branchname)
	{	
		super.Name=Branchname;
		super.showStudname(Branchname);
	}
	String Name;
	void showStudname(String Studname)
	{
		System.out.println("the student name in child class:"+Studname);
	}
}
class Student3 extends Student2
{
	Student3(String facultyname)
	{
		super(facultyname);
		super.showStudname(facultyname);	

	}
	String Name;
	void showStudname(String facname)
	{
		System.out.println("the student name in child class:"+facname);
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		Student1 obj=new Student3("abdul");
		obj.showStudname("sundar");
		obj.showStudname("steve");
	}
}


