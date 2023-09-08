package in.com.raysOOP;

public class Atm {
	private int Balance=0;
	public void setBalance(int balance) {
		this.Balance=balance;
		}
		public int getBalance() {
			return Balance;
		}
				
			public void deposite(int amt) {
				int total=getBalance()+amt;
				setBalance(total);
	System.out.println("balance after deposite="+getBalance());
			}
			  public void wihdraw(int amt) {
				  int total =getBalance()-amt;
	       if (total<2000) {
					  System.out.println("insufficient balance!!!");
	       }
			else {
		            setBalance(total);
			}
	     System.out.println("balance after withdraw="+getBalance());
				  
			  }
}
				
			
			
		
		
		
	
			


