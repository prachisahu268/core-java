package in.com.inheritance;

public class Circleee extends Shapeee {
	private int radius=0;
	private double pi=3.14;
	
	public void setRadius(int radius) {
		this.radius=radius;
		
	}
	public int getRadius() {
		return radius;
	}
		public double area() {
			double cArea= pi*getRadius()*getRadius();
			System.out.println("this is area method"+cArea);
			return cArea;
		}
	
	
	
	
	
	
	
	
	

}
