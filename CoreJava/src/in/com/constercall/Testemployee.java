package in.com.constercall;

import java.util.ArrayList;
import java.util.Iterator;

import in.com.CollectionsFramework.Employee;

public class Testemployee {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"prachi","Indore");
		ArrayList list =new ArrayList();
		list.add(e1);
		
		//trik 1
		
		//Employee e=(Employee) list.get(0);
		//System.out.println(e.getId());
		//System.out.println(e.getName());
		//System.out.println(e.getAddress());
	
		//trick 2
		
		//for (int i = 0; i < list.size(); i++) {
		//	Employee e=(Employee) list.get(0);
		//	System.out.println(e);
			
		//trick3
	for (Object object : list) {
			Employee e=(Employee) object;	
			System.out.println(e);
	
	//	Iterator it =list.iterator();
	  //  while (it.hasNext()) {
	  // System.out.println(it.hasNext());
		
		}
	
	
	}
		}
		
	
