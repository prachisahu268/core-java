package in.com.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestEmployes {
	public static void main(String[] args) {
		
		ArrayList<Employes>e=new ArrayList();
		e.add(new Employes(1,"tana","9343884747"));
		e.add(new Employes(1, "mehak", "9074240881"));
System.out.println(e);

Collections.sort(e);
System.out.println(e);
}

}

