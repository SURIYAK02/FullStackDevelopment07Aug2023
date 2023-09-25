package com.gentech.noargsconstructor;

class Employee
{
	  String FirstName;
	  int age;
	  int id;
	  String Worktype;
	  Employee(){
		    FirstName="kavin";
			age=21;
			id=5115;
			Worktype="Developer";
			System.out.println("FirstName:"+FirstName);
			System.out.println("Age:"+age);
			System.out.println("id:"+id);
			System.out.println("worktype;"+Worktype);
			System.out.println("----------------------");
	  }
}  
	  
class Department
{
	String DepartName;
	int id;
	String Location;
	int Zipcode;
	Department(){
		DepartName="School";
		id=9080;
		Location="Kanchipuram";
		Zipcode=631502;
		System.out.println("DepartName:"+DepartName);
		System.out.println("id:"+id);
		System.out.println("Location:"+Location);
		System.out.println("Zipcode:"+Zipcode);
		System.out.println("-----------------------");
	}
}

class Insurence
{
	String InsurenceName;
	String InsurenceType;
	String CustomerName;
	int id;
	Insurence(){
		InsurenceName="Bajaji";
		InsurenceType="Life Insurence";
		CustomerName="Guna";
		id=6383;
		System.out.println("InsurenceName:"+InsurenceName);
		System.out.println("InsurenceType:"+InsurenceType);
		System.out.println("CustomerName:"+CustomerName);
		System.out.println("id:"+id);
	}
}

public class EmpDeptIns {

	public static void main(String[] args) {
				
				Employee e= new Employee();
				
				Department d=new Department();
			
				Insurence life= new Insurence();			
	}
}
