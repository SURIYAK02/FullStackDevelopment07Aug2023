package com.gentech.program;

class summa{
	void demo1(){
		System.out.println("lavada");
		
	}
}
class summa1{
	{
		System.out.println("gunalavada");
		summa2.demo2();
		
	}
}
class summa2{
	static void demo2(){
		System.out.println("dori lavada");
		
	}
}
class summa3{
	static{
		System.out.println("thulasi badu");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		summa1 o = new summa1();
	}
}
