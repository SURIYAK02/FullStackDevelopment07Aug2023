package com.gentech.classes;

class TwoWheeler{
	String bikeName;
	String bikeModel;
	String bikeColor;
	String mileage;
	float price;
	int bikeNo;
}
class FourWheeler{
	String carName;
	String carModel;
	String carColor;
	String mileage;
	float price;
	int carNo;
}
class HeavyWheeler{
	String vehName;
	String brandName;
	String loadCapacity;
	String mileage;
	float price;
	int vehNo;
}
public class Vehicle {

	public static void main(String[] args) {
		TwoWheeler two=new TwoWheeler();
		two.bikeName="Pulser";
		two.bikeModel="Pulser 220F";
		two.bikeColor="Blue";
		two.mileage="40kmpl";
		two.price=95000;
		two.bikeNo=3456;
		System.out.println("BikeName:"+two.bikeName);
		System.out.println("BikeModel:"+two.bikeModel);
		System.out.println("BikeColor:"+two.bikeColor);
		System.out.println("Mileage:"+two.mileage);
		System.out.println("BikeNo:"+two.bikeNo);
		System.out.println("--------------------------");
		FourWheeler four=new FourWheeler();
		four.carName="Audi";
		four.carModel="Audi A4";
		four.carColor="White";
		four.mileage="18kmpl";
		four.price=4500000;
		four.carNo=6000;
		System.out.println("CarName:"+four.carName);
		System.out.println("CarModel:"+four.carModel);
		System.out.println("CarColor:"+four.carColor);
		System.out.println("Mileage:"+four.mileage);
		System.out.println("CarNo:"+four.carNo);
		System.out.println("--------------------------");
		HeavyWheeler heavy=new HeavyWheeler();
		heavy.vehName="Tipper Truck";
		heavy.brandName="Eicher";
		heavy.loadCapacity="44Tones";
		heavy.mileage="4kmpl";
		heavy.price=700000;
		heavy.vehNo=9632;
		System.out.println("VehName:"+heavy.vehName);
		System.out.println("BrandName:"+heavy.brandName);
		System.out.println("LoadCapacity:"+heavy.loadCapacity);
		System.out.println("Mileage:"+heavy.mileage);
		System.out.println("Price"+heavy.price);
		System.out.println("VehNo:"+heavy.vehNo);

	}

}
