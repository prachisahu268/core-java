package in.com.io;


import java.io.FileReader;
import java.io.IOException;

public class Filereder {
public static void main(String[] args) throws IOException {
	
	FileReader reader=new FileReader ("C:\\Users\\Dell\\OneDrive\\Desktop\\io\\tana.txt");
	
	int ch= reader.read();
	while(ch!=-1) {
		System.out.print((char)ch);
		ch=reader.read();
	}
	reader.close();
}
	
}
	
