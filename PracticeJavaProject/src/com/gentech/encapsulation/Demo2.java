package com.gentech.encapsulation;


class maths1{
	static maths1 obj=null;
	private maths1()
	{
		// It is Private Constructor
	}
	void add(int x, int y) {
		int res=(x+y);
		System.out.println("add res:"+res);
}
	void mul(int x, int y) {
		int res=(x*y);
		System.out.println("Mul res:"+res);
	}
	public static maths1 getInstance() {
		if (obj==null)
		{
			obj=new maths1();
			}
		return obj;
		
	}
}	
	
public class Demo2 {

	public static void main(String[] args) {
       maths1 o = maths1.getInstance();
       o.add(10, 20);
       o.mul(10, 20);
       
       maths1 o2 = maths1.getInstance();
       o2.add(10, 20);
       o2.mul(10, 20);
       
       maths1 o3 = maths1.getInstance();
       o3.add(10, 20);
       o3.mul(10, 20);
       
       if(o==o2 && o2==o3) {
    	   System.out.println("Achieved");
       }
       else {
    	   System.out.println("Not achieved");
       }
       
     
	}
}




		

	


