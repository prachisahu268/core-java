package in.com.CollectionsFramework;

import java.util.Comparator;

public class ComparatorByPhone implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		return o1.getPhone().compareTo(o2.getPhone());
	}

}
