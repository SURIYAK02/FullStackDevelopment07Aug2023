package com.gentech.classes;
class Fruit{
	String fruitName;
	String hybrid;
	String fruitColor;
	int noofYearstogrow;
	
}
class Flower{
	String flowerName;
	String flowerColor;
	int noofMonthstogrow;
}
class Vegetable{
	String vegName;
	String vegType;
	String humanBenifits;
	int noofMonthstogrow;
}
public class FruFloVeg {

	public static void main(String[] args) {
	Fruit fru=new Fruit();
	fru.fruitName="Apple";
	fru.hybrid="Ooty Apple";
	fru.fruitColor="Red";
	fru.noofYearstogrow=3;
    System.out.println("FruitName:"+fru.fruitName);
    System.out.println("Hybrid:"+fru.hybrid);
    System.out.println("FruitColor:"+fru.fruitColor);
    System.out.println("No of Years to Grow:"+fru.noofYearstogrow);
    System.out.println("----------------------");
    Flower flo=new Flower();
    flo.flowerName="Rose";
    flo.flowerColor="Red";
    flo.noofMonthstogrow=3;
    System.out.println("FlowerName:"+flo.flowerName);
    System.out.println("FlowerColor:"+flo.flowerColor);
    System.out.println("No of Months to Grow"+flo.noofMonthstogrow);
    System.out.println("----------------------");
    Vegetable veg=new Vegetable();
    veg.vegName="Carrot";
    veg.vegType="Root";
    veg.humanBenifits="Eye";
    veg.noofMonthstogrow=3;
    System.out.println("VegName:"+veg.vegName);
    System.out.println("VegType"+veg.vegType);
    System.out.println("HumanBenefits:"+veg.humanBenifits);
    System.out.println("No of Months to Grow;:"+veg.noofMonthstogrow);

	}

}
