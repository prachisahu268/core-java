package in.com.io;

import java.io.FileWriter;
import java.io.IOException;

public class Fileriter {
public static void main(String[] args) throws IOException {
	FileWriter writer=new FileWriter("C:\\Users\\Dell\\OneDrive\\Desktop\\io\\mradul.txt");
	writer.write("hellow >>!!!!");
	writer.write("this is prachi....");
    writer.close();	
System.out.println("data successfully write");	
}
}
