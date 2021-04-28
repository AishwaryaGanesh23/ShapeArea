

public class Circle implements Shape {
	private double radius, area;
	
	public Circle(double radius) {
		this.radius = radius;
		area = 3.14*radius*radius;
	}
	 @Override
	   public void area() {
	      System.out.println("Circle Area: "+area);
	   }
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
}
