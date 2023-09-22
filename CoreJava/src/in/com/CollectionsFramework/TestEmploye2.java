package in.com.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmploye2 {
	public static void main(String[] args) {
		ArrayList<Employee2> emp =new ArrayList();
     emp.add(new Employee2 (1,"preet","78049380"));
     emp.add(new Employee2(7, "anshu", "256342687"));
	 emp.add(new Employee2(6, "yuvraj","6742537887"));
	emp.add(new Employee2(4 ,"pihuuu","432686790"));
	
	System.out.println(emp);
	
	Collections.sort(emp,new ComparatorByempId());
	System.out.println(emp);
    
	
	Collections.sort(emp,new ComparatorByName());
	System.out.println(emp);
	
	
	Collections.sort(emp ,new ComparatorByPhone());
	System.out.println(emp);
	}	}