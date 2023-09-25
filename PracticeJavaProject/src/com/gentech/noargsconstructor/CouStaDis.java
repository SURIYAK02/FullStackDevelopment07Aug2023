package com.gentech.noargsconstructor;

class Country
{
	String CountryName;
	String CountryCaptial;
	String NationalAnimal;
	int Countrycode;
	Country(){
    CountryName="India";
	CountryCaptial="Delhi";
	NationalAnimal="Tiger";
	Countrycode=07;
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
	State(){
		StateName="TamilNadu";
		StateCaptial="Chennai";
		StateZone="SouthZone";
		StateCount=70000000;

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
	District(){
		DistrictName="Kanchipuram";
		StateName="TamilNadu";
		DistrictTaluk="kanchipuram taluk";
		DistrictCode=631;
		System.out.println("DistrictName:"+DistrictName);
		System.out.println("StateName:"+StateName);
		System.out.println("DistrictTaluk:"+DistrictTaluk);
		System.out.println("DistrictCode:"+DistrictCode);
		
	}
}

public class CouStaDis {

	public static void main(String[] args) {
		Country ind= new Country();
		

		State Tn=new State();
		

		District Kpm= new District();
		
	}
}
