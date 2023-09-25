package com.gentech.parameterized;

class Desktop 
{
	
    Desktop(String brand,String model,int ramSizeGB, String isSSDSupported){
    	
		System.out.println("Brand:"+brand);
		System.out.println("model no.:"+model);
		System.out.println("ramSize:"+ramSizeGB+" GB");
		System.out.println("Is this SSD supported:"+isSSDSupported);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    	
    }

}

class Laptop 
{
	
    Laptop(String brand,String model,double screenSizeInches, int batteryCapacity){
    	
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Screen Size:"+screenSizeInches+" inches");
		System.out.println("Battery capacity:"+batteryCapacity);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}

class Mobile
{
	
    Mobile(String brand,  String model, String operatingSystem,String isMobileDataEnabled){
    	brand="Redmi";
		model="MI 7pro";
		operatingSystem="Android";
		isMobileDataEnabled="No";
		System.out.println("Brand:"+brand);
		System.out.println("Model :"+model);
		System.out.println("OS :"+operatingSystem);
		System.out.println("Is the MobileData enabled:"+isMobileDataEnabled);
    }

}

public class DeskLap {

	public static void main(String[] args) {
		 Desktop D=new Desktop("HP","se2",128,"yes");
				
			Laptop L=new Laptop("Lenovo","v15",14.5,8000);
				
			Mobile M=new Mobile("poco","x3","Android","no");
			
	}

}
