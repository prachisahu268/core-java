package com.rays.basic;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int a=221;
		int b=0;
		int c;
		int d=a;
		
		
		while(d>0) {
			
			c=d%10;
			
			b=b+(c*c*c);
			
			d=d/10;
			
		}
		
		if (b==a) {
			System.out.println("yes");
			
		}else {
			System.out.println("no");
		}
		
	}
	
	
	
	
	

}
