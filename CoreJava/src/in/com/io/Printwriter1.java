package in.com.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter1 {
	public static void main(String[] args) throws IOException {
		FileWriter file=new  FileWriter("C:\\Users\\Dell\\OneDrive\\Desktop\\prachi\\tamanna.txt");
       PrintWriter out =new PrintWriter(file);
       out.println("java is a programming language");
       out.println("u known java");
       
       file.close();
       out.close();
       System.out.println("data write successfully!!");
       
	}
	

}
