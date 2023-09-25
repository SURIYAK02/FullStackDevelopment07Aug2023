package com.gentech.parameterized;
class Fruit{

	Fruit(String fruitName,	String hybrid,String fruitColor,int noofYearstogrow){

		System.out.println("FruitName:"+fruitName);
		System.out.println("Hybrid:"+hybrid);
		System.out.println("FruitColor:"+fruitColor);
		System.out.println("No of Years to Grow:"+noofYearstogrow);
		System.out.println("----------------------");
	}
}
class Flower{

	Flower(String flowerName,String flowerColor,int noofMonthstogrow){

		System.out.println("FlowerName:"+flowerName);
		System.out.println("FlowerColor:"+flowerColor);
		System.out.println("No of Months to Grow"+noofMonthstogrow);
		System.out.println("----------------------");
	}
}
class Vegetable{

	Vegetable(String vegName,String vegType,String humanBenifits,int noofMonthstogrow){
		vegName="Carrot";
		vegType="Root";
		humanBenifits="Eye";
		noofMonthstogrow=3;
		System.out.println("VegName:"+vegName);
		System.out.println("VegType"+vegType);
		System.out.println("HumanBenefits:"+humanBenifits);
		System.out.println("No of Months to Grow;:"+noofMonthstogrow);
	}
}
public class FruFloVeg {

	public static void main(String[] args) {
		Fruit fru=new Fruit("Apple","Ooty Apple","Red",3);

		Flower flo=new Flower("Rose","Red",3);

		Vegetable veg=new Vegetable("Carrot","Root","Eye",3);


	}

}
