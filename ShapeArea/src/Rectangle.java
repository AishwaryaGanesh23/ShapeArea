

public class Rectangle implements Shape {
	private double length, width, area;
	
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
		area = width*width;
	}
	
	 @Override
	   public void area() {
	      System.out.println("Rectangle Area: "+area);
	   }

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
