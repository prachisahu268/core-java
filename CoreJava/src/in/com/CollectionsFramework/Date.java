package in.com.CollectionsFramework;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Date {
public static void main(String[] args)throws ParseException {
	String str="8/09/2023";
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
 date= sdf.parse(str);
	
}

}
