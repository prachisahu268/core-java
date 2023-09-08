package in.com.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializationtest {
	public static void main(String[] args)throws Exception {
		FileOutputStream file=new FileOutputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\prachi\\obj.txt");
	
		ObjectOutputStream out=new ObjectOutputStream(file);
		
		
		Employee e =new Employee();
		e.EmpId=1;
		e.name="prachi";
		e.salary=10000;
		e.bonus=5000;
		e.total=e.salary + e.bonus;
		out.writeObject(e);
		file.close();
		out.close();
		System.out.println("object convert into bytecode!!");
		
		
		
		
		
	}
	

}
