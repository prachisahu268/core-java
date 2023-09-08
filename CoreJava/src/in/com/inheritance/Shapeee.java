package in.com.inheritance;

public class Shapeee {
	private int borderwidth=0;
	private String color=null;
	
	public void setBorderwidth(int borderwidth) {
		this.borderwidth=borderwidth;
	}
	public int getBorderwidth() {
		return borderwidth;
		
	}
	public void setColor(String color) {
        this.color=color;
	}
	public String getColor() {
		return color;
	
	}
	public double area() {
		System.out.println("this is area method");
		return area();
	}
}
