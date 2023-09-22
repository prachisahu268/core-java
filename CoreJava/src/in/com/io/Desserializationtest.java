package in.com.io;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Desserializationtest {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\prachi\\obj.txt");
		ObjectInputStream in=new ObjectInputStream(file);
		Employee e=(Employee) in.readObject();
		System.out.println("EmpId "+ e.EmpId);
		System.out.println("name "+e.name);
		System.out.println("salary "+ e.salary);
		System.out.println("bonus "+e.bonus);
		System.out.println("total "+ e.total);
		file.close();
		in.close();
	}		
		
	}
	
	
	
	


