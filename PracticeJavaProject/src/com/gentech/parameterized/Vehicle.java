package com.gentech.parameterized;

class TwoWheeler{
	
	TwoWheeler(String bikeName,String bikeModel,String bikeColor,String mileage,float price,int bikeNo){
		
		System.out.println("BikeName:"+bikeName);
		System.out.println("BikeModel:"+bikeModel);
		System.out.println("BikeColor:"+bikeColor);
		System.out.println("Mileage:"+mileage);
		System.out.println("BikeNo:"+bikeNo);
		System.out.println("--------------------------");
	}
}
class FourWheeler{
	
	FourWheeler(String carName,String carModel,String carColor,String mileage,float price,int carNo){
		
		System.out.println("CarName:"+carName);
		System.out.println("CarModel:"+carModel);
		System.out.println("CarColor:"+carColor);
		System.out.println("Mileage:"+mileage);
		System.out.println("CarNo:"+carNo);
		System.out.println("--------------------------");
	}
}
class HeavyWheeler{
	
	HeavyWheeler(String vehName,String brandName,String loadCapacity,String mileage,float price,int vehNo){
	
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
		TwoWheeler two=new TwoWheeler("Pulser","Pulser 220F","Blue","40kmpl",94000,8765);
		
		FourWheeler four=new FourWheeler("Audi","Audi A4","White","18kmpl",4500000,0000);
		
		HeavyWheeler heavy=new HeavyWheeler("Tripper Truck","Eicher","44Tones","4kmpl",700000,9765);
		
	}

}
