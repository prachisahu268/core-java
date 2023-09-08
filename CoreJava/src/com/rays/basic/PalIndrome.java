package com.rays.basic;

public class PalIndrome {
	public static void main (String []arge){
	
		
		int a=1551;
		int b=a;
		int c = 0;
		int d;
		
      while (b>0) {
    	  d=b%10;
    	  
    	  c=c*10+d;
    	  
    	  b=b/10;
      } if (a==c) {
    		  System.out.println("yes");
    	  
    	  }else {
    		  System.out.println("no");
    	  }
      }
}
