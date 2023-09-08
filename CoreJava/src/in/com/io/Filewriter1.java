package in.com.io;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter1 {
	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter("C:\\Users\\Dell\\OneDrive\\Desktop\\prachi\\tanu.txt");

	writer.write("Hii this is prachi!!!!");
	writer.write("i am a student");
	writer.close();
	System.out.println("data write successfully!!");	
	}
}
