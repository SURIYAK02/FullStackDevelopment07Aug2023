package com.gentech.classes;

class Employee
{
	  String FirstName;
	  int age;
	  int id;
	  String Worktype;
}  
	  
class Department
{
	String DepartName;
	int id;
	String Location;
	int Zipcode;
}

class Insurence
{
	String InsurenceName;
	String InsurenceType;
	String CustomerName;
	int id;
}

public class EmpDeptIns {

	public static void main(String[] args) {
				
				Employee kavin= new Employee();
				kavin.FirstName="kavin";
				kavin.age=21;
				kavin.id=5115;
				kavin.Worktype="Developer";
				System.out.println("FirstName:"+kavin.FirstName);
				System.out.println("Age:"+kavin.age);
				System.out.println("id:"+kavin.id);
				System.out.println("worktype;"+kavin.Worktype);
				System.out.println("----------------------");
				
				Department School=new Department();
				School.DepartName="School";
				School.id=9080;
				School.Location="Kanchipuram";
				School.Zipcode=631502;
				System.out.println("DepartName:"+School.DepartName);
				System.out.println("id:"+School.id);
				System.out.println("Location:"+School.Location);
				System.out.println("Zipcode:"+School.Zipcode);
				System.out.println("-----------------------");
				
				Insurence Life= new Insurence();
				Life.InsurenceName="Bajaji";
				Life.InsurenceType="Life Insurence";
				Life.CustomerName="Guna";
				Life.id=6383;
				System.out.println("InsurenceName:"+Life.InsurenceName);
				System.out.println("InsurenceType:"+Life.InsurenceType);
				System.out.println("CustomerName:"+Life.CustomerName);
				System.out.println("id:"+Life.id);
		

	}

}
