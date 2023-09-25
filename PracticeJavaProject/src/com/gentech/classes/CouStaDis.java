package com.gentech.classes;

class Country
{
	String CountryName;
	String CountryCaptial;
	String NationalAnimal;
	int Countrycode;

}  

class State
{
	String StateName;
	String StateCaptial;
	String StateZone;
	int StateCount;
}

class District
{
	String DistrictName;
	String StateName;
	String DistrictTaluk;
	int DistrictCode;
}

public class CouStaDis {

	public static void main(String[] args) {
		Country ind= new Country();
		ind.CountryName="India";
		ind.CountryCaptial="Delhi";
		ind.NationalAnimal="Tiger";
		ind.Countrycode=07;
		System.out.println("CountryName:"+ind.CountryName);
		System.out.println("CountryCaptial:"+ind.CountryCaptial);
		System.out.println("NationalAnimal:"+ind.NationalAnimal);
		System.out.println("Countrycode;"+ind.Countrycode);
		System.out.println("----------------------");

		State Tn=new State();
		Tn.StateName="TamilNadu";
		Tn.StateCaptial="Chennai";
		Tn.StateZone="SouthZone";
		Tn.StateCount=70000000;

		System.out.println("StateName:"+Tn.StateName);
		System.out.println("StateCaptial="+Tn.StateCaptial);
		System.out.println("StateZone:"+Tn.StateZone);
		System.out.println("StateCount:"+Tn.StateCount);
		System.out.println("-----------------------");

		District Kpm= new District();
		Kpm.DistrictName="Kanchipuram";
		Kpm.StateName="TamilNadu";
		Kpm.DistrictTaluk="kanchipuram taluk";
		Kpm.DistrictCode=631;
		System.out.println("DistrictName:"+Kpm.DistrictName);
		System.out.println("StateName:"+Kpm.StateName);
		System.out.println("DistrictTaluk:"+Kpm.DistrictTaluk);
		System.out.println("DistrictCode:"+Kpm.DistrictCode);
	}
}
