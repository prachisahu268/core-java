package in.com.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Buffer_reader {
	


	public static void main(String[] args) throws IOException{
		FileReader file=new FileReader("C:\\Users\\Dell\\OneDrive\\Desktop\\io//tana.txt");
		BufferedReader reader=new BufferedReader(file);
		String line =reader.readLine();
		while(line!=null) {
			System.out.println(line);
		line=reader.readLine()	;
		
		}
		reader.close();
		file.close();
		
		
	}

}
