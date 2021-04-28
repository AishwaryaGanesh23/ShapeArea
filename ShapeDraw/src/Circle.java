
public class Circle extends Shape {
   private int x, y, radius;

   public Circle(int x, int y, int radius, DrawShape drawshape) {
      super(drawshape);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }

   public void draw() {
	   drawshape.drawCircle(radius,x,y);
   }
}