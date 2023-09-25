package com.gentech.parameterized;

class Country
{
	String CountryName;
	String CountryCaptial;
	String NationalAnimal;
	int Countrycode;
	Country(String cname,String ccap,String nani,int ccode)
	{
    CountryName=cname;
	CountryCaptial=ccap;
	NationalAnimal=nani;
	Countrycode=ccode;
	System.out.println("CountryName:"+CountryName);
	System.out.println("CountryCaptial:"+CountryCaptial);
	System.out.println("NationalAnimal:"+NationalAnimal);
	System.out.println("Countrycode;"+Countrycode);
	System.out.println("----------------------");		
	}
}  

class State
{
	String StateName;
	String StateCaptial;
	String StateZone;
	int StateCount;
	State(String sname,String scap,String szone,int scount){
		StateName=sname;
		StateCaptial=scap;
		StateZone=szone;
		StateCount=scount;

		System.out.println("StateName:"+StateName);
		System.out.println("StateCaptial="+StateCaptial);
		System.out.println("StateZone:"+StateZone);
		System.out.println("StateCount:"+StateCount);
		System.out.println("-----------------------");
	}
}

class District
{
	String DistrictName;
	String StateName;
	String DistrictTaluk;
	int DistrictCode;
	District(String dname,String sname,String dtal,int discode){
		DistrictName=dname;
		StateName=sname;
		DistrictTaluk=dtal;
		DistrictCode=discode;
		System.out.println("DistrictName:"+DistrictName);
		System.out.println("StateName:"+StateName);
		System.out.println("DistrictTaluk:"+DistrictTaluk);
		System.out.println("DistrictCode:"+DistrictCode);
		
	}
}

public class CouStaDis {

	public static void main(String[] args) {
		Country ind= new Country("India","Delhi","Tiger",07);
		

		State Tn=new State("TamilNadu","Chennai","SouthZone",78653);
		

		District Kpm= new District("kpm","tn","kpmTaluk",632145);
		
	}
}
