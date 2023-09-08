package in.com.inheritance;

public class Rectangleee extends Shapeee {
	private int length=0;
	private int width=0;
	
	
	public void setLength(int length) {
		this.length = length;
		
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
    public double area() {
    	int rArea=getLength()*getWidth();
    	System.out.println("this is area method"+rArea);
		return rArea;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
