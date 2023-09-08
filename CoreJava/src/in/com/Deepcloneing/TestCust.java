package in.com.Deepcloneing;

public class TestCust {
public static void main(String[] args) throws CloneNotSupportedException {
	Customer c1=new Customer("shivam");
	Customer c2=(Customer)c1.clone();
	
	c2.name="hardeep";
	c2.a.balance=50000;
	
	System.out.println("orignal");
	System.out.println("NAME=" +c1.name);
	System.out.println("BALANCE"+c1.a.balance);
	
	System.out.println("DUPLICATE CLONABLE");
	System.out.println("NAME="+c2.name);
	System.out.println("BALANCE="+ c2.a.balance);
	
	
			}
	
	
}
