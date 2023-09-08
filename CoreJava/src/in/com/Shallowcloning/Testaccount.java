package in.com.Shallowcloning;

public class Testaccount {
public static void main(String[] args) throws CloneNotSupportedException {
	Account a=new Account(1000);
    	//ystem.out.println(a.balance);
    	
    Account a1=(Account) a.clone();
    a.balance=500;
    System.out.println(a.balance);
    System.out.println(a1.balance);
    


}
}
