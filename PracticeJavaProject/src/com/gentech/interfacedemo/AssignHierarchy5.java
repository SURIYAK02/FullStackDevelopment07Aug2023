package com.gentech.interfacedemo;

interface Name2{
	void showStudentName(String name);
}
interface Reg2 extends Name2{
	void showRegisterNo(int reg);
}
interface Age2 extends Name2{
	void showStudentAge(int age);
}
interface Loc2 extends Name2{
	void showStudentLoc(String loc);
}
class Studentdetails implements Reg2,Age2,Loc2
{
	public void showStudentName(String name) {
		System.out.println("StudentName:"+name);
	}
	public void showRegisterNo(int reg) {
		System.out.println("RegisterNo:"+reg);
	}
	public void showStudentAge(int age) {
		System.out.println("StudentAge:"+age);
	}
	public void showStudentLoc(String loc) {
		System.out.println("StudentLoc:"+loc);
	}
}
public class AssignHierarchy5 {

	public static void main(String[] args) {
		Studentdetails o1=new Studentdetails();
		o1.showStudentName("Suriya");
		o1.showRegisterNo(9876543);
		o1.showStudentAge(21);
		o1.showStudentLoc("Kanchipuram");
	}
}


