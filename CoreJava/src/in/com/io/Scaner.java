package in.com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Scaner {
	public static void main(String[] args) throws Exception {
		FileReader file =new FileReader("C:\\Users\\Dell\\OneDrive\\Desktop\\io\\tana.txt");
		
		Scanner sc =new Scanner(file);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			
			
		}
		sc.close();
	}
	

}
