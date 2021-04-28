public abstract class Shape {
   protected DrawShape drawshape;
   
   protected Shape(DrawShape drawshape){
      this.drawshape = drawshape;
   }
   
   public abstract void draw();	
}