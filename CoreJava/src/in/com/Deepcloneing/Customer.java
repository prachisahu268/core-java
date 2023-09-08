package in.com.Deepcloneing;

public class Customer implements Cloneable {
public String name =null;
public Account a=null;

    //constructor
   public Customer (String name) {
	   this.name=name;
	   this.a=new Account(15000);
	   
   }
     @Override
    	protected Object clone() throws CloneNotSupportedException {
    		Customer c=(Customer)super.clone(); 
    	 a=(Account)a.clone();
    	 return c;
    	}
	
	
	
}
