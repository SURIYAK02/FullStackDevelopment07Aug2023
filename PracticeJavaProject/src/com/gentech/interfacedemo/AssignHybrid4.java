package com.gentech.interfacedemo;

interface Name3{
	void showStudentName(String name);
}
interface Reg3 extends Name3{
	void showRegisterNo(int reg);
}
interface Age3 extends Reg3{
	void showStudentAge(int age);
}
interface Loc3 extends Name3{
	void showStudentLoc(String loc);
}
class Studentdetail implements Age3,Loc3
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
public class AssignHybrid4 {

	public static void main(String[] args) {
		Studentdetail o1=new Studentdetail();
		o1.showStudentName("Suriya");
		o1.showRegisterNo(9876543);
		o1.showStudentAge(21);
		o1.showStudentLoc("Kanchipuram");
	}
}



