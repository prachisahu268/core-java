package in.com.inheritance;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle ();
		//Rectangle s=new Rectangle();
		//Rectangle r1=(Rectangle)s;
		r1.setBorderWidth(10);
		r1.setColor("red");
		r1.setLength(90);
		r1.setWidth(50);
		System.out.println(r1.getBorderWidth());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());
	}
	

}
