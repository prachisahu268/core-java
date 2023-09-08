package com.rays.basic;

public class TypeCasting {
	
	public static void main(String[] args) {
		// implicit
		byte b = 10;
		int i =  b;
		System.out.println(i);
		
		int a=15;
		float f=a;
		System.out.println(f);
		//explicit
		 long l= 100;
		 float s = (float) l;
		 System.out.println(s);
		 
		 double r=3547.90d;
		 float p= (float)r;
		
	}

}
