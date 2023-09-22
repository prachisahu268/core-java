package in.com.CollectionsFramework;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Dob {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat( "dd/MM/yyyy");
		String str=sdf.format(date);
		System.out.println(str);
		
		
		
	}
	

}
