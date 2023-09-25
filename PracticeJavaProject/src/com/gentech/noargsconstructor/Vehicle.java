package com.gentech.noargsconstructor;

class TwoWheeler{
	String bikeName;
	String bikeModel;
	String bikeColor;
	String mileage;
	float price;
	int bikeNo;
	TwoWheeler(){
		bikeName="Pulser";
		bikeModel="Pulser 220F";
		bikeColor="Blue";
		mileage="40kmpl";
		price=95000;
		bikeNo=3456;
		System.out.println("BikeName:"+bikeName);
		System.out.println("BikeModel:"+bikeModel);
		System.out.println("BikeColor:"+bikeColor);
		System.out.println("Mileage:"+mileage);
		System.out.println("BikeNo:"+bikeNo);
		System.out.println("--------------------------");
	}
}
class FourWheeler{
	String carName;
	String carModel;
	String carColor;
	String mileage;
	float price;
	int carNo;
	FourWheeler(){
		carName="Audi";
		carModel="Audi A4";
		carColor="White";
		mileage="18kmpl";
		price=4500000;
		carNo=6000;
		System.out.println("CarName:"+carName);
		System.out.println("CarModel:"+carModel);
		System.out.println("CarColor:"+carColor);
		System.out.println("Mileage:"+mileage);
		System.out.println("CarNo:"+carNo);
		System.out.println("--------------------------");
	}
}
class HeavyWheeler{
	String vehName;
	String brandName;
	String loadCapacity;
	String mileage;
	float price;
	int vehNo;
	HeavyWheeler(){
		vehName="Tipper Truck";
		brandName="Eicher";
		loadCapacity="44Tones";
		mileage="4kmpl";
		price=700000;
		vehNo=9632;
		System.out.println("VehName:"+vehName);
		System.out.println("BrandName:"+brandName);
		System.out.println("LoadCapacity:"+loadCapacity);
		System.out.println("Mileage:"+mileage);
		System.out.println("Price"+price);
		System.out.println("VehNo:"+vehNo);
	}
}
public class Vehicle {

	public static void main(String[] args) {
		TwoWheeler two=new TwoWheeler();
		
		FourWheeler four=new FourWheeler();
		
		HeavyWheeler heavy=new HeavyWheeler();
		

	}

}
