package in.com.ExceptionHandaling;

public class ExceptionHandaling {
	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		System.out.println("main method start");
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
	System.out.println("main method ended");}
	

}
