

public class Triangle implements Shape {
	private double base, height,area;
	
	public Triangle(double base,double height) {
		this.base = base;
		this.height = height;
		area = base * height* 0.5;
	}
	
	 @Override
	   public void area() {
	      System.out.println("Triangle Area: "+area);
	   }

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
