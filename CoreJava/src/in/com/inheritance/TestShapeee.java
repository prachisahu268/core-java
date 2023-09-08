package in.com.inheritance;

public class TestShapeee {
	
	public static void main (String []args) {
		Shapeee[] s =new Shapeee[3];
		s[0] = new Rectangleee();
		s[1] = new Circleee();
		s[2] = new Triangleee();
		
		Rectangleee r =(Rectangleee) s[0];
		r.setWidth(10);
		r.setLength(10);
		//r.area();
		
		Circleee c= (Circleee)s[1];
		c.setRadius(20);
		//c.area();
		
		Triangleee t=(Triangleee)s[2];
		t.setBase(12);
		t.setHeight(15);
		//t.area();
		
		for (int i = 0;  i< s.length;i ++) {
			System.out.println(s[i].area());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
