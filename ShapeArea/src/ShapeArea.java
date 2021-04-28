

public class ShapeArea {

	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      Shape shape1 = shapeFactory.getShape("CIRCLE",3);
	      shape1.area();
	      
	      Shape shape2 = shapeFactory.getShape("RECTANGLE",5,4);
	      shape2.area();

	      Shape shape3 = shapeFactory.getShape("Triangle",6,4);
	      shape3.area();
	   }
}
