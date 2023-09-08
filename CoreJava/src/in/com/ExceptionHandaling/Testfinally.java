package in.com.ExceptionHandaling;

public class Testfinally {
	public static void main(String[] args) {
		
		try {
			int a=10;
			int b=5;
			int c=a/b;
			System.out.println("division="+c);
			
		}catch(Exception e) {
			//this is method!!!!!!
			//System.out.println(e.getMessage());       
			//e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
	}
	

}
