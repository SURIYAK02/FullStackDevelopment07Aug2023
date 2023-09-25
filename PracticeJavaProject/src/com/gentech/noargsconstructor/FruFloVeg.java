package com.gentech.noargsconstructor;
class Fruit{
	String fruitName;
	String hybrid;
	String fruitColor;
	int noofYearstogrow;
	Fruit(){
		fruitName="Apple";
		hybrid="Ooty Apple";
		fruitColor="Red";
		noofYearstogrow=3;
	    System.out.println("FruitName:"+fruitName);
	    System.out.println("Hybrid:"+hybrid);
	    System.out.println("FruitColor:"+fruitColor);
	    System.out.println("No of Years to Grow:"+noofYearstogrow);
	    System.out.println("----------------------");
	}
}
class Flower{
	String flowerName;
	String flowerColor;
	int noofMonthstogrow;
	Flower(){
		flowerName="Rose";
	    flowerColor="Red";
	    noofMonthstogrow=3;
	    System.out.println("FlowerName:"+flowerName);
	    System.out.println("FlowerColor:"+flowerColor);
	    System.out.println("No of Months to Grow"+noofMonthstogrow);
	    System.out.println("----------------------");
	}
}
class Vegetable{
	String vegName;
	String vegType;
	String humanBenifits;
	int noofMonthstogrow;
	Vegetable(){
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
	Fruit fru=new Fruit();

    Flower flo=new Flower();
    
    Vegetable veg=new Vegetable();
    

	}

}
