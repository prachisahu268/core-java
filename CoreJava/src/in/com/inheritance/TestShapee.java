package in.com.inheritance;

public class TestShapee {
public static void main(String[] args) {
	

	Shape s=new Shape();
	s.setBorderWidth(10);
    s.setColor("pink");
    System.out.println(s.getBorderWidth());
    System.out.println(s.getColor());
    
   Rectanglee r=new Rectanglee();
   r.setLength(20);
   r.setWidth(20);
   r.area();
   
   Shape s1=new Rectanglee();
   Rectanglee r1=(Rectanglee)s1;
   r1.setLength(50);
   r1.setWidth(60);
   r1.area();}
	
}
