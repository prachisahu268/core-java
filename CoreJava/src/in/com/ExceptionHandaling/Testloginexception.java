package in.com.ExceptionHandaling;

public class Testloginexception {
	
	public static void main(String[] args) {
		String name=("prachi");
		if (name.equals("pihuu")) {
			System.out.println("valid user");
		}
		else {
			LoginException e=new LoginException();
			try {
				throw e;
			}catch(Exception e2) {
				System.out.println(e);
			}
			
			
		}
	}

}
