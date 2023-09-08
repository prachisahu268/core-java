package in.com.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReader1 {
	
//in this prog we have read write and jab tk hum condition(bye)
	//nahi denge jab tak writer hote rahega !!
	public static void main(String[] args)throws Exception {
		InputStreamReader isReader=new InputStreamReader (System.in);	
	    
		BufferedReader in=new BufferedReader(isReader);
		PrintWriter out =new PrintWriter("C:\\Users\\Dell\\OneDrive\\Desktop\\prachi\\mehak.txt");
	 String line=in.readLine();
	 while(!(line.equals("bye"))) {
		 out.println(line);
       line= in.readLine();
        
	 }
	in.close();
	out.close();
	isReader.close();}

}
