package in.com.Abstract;

public class TestshapeAbs {
	
	public static void main(String[] args) {
		ShapeAbs s=new RectangleAbs();
		s.area();
		s.hellow();
	    ShapeAbs.hellow();
	 
	    
	    RectangleAbs r= (RectangleAbs) s;
	    r.area();
	    r.hellow();
	}
}