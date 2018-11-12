package shapePolymorphism;

public class Rectangle extends Shape{
	private int x, y, w, h;

	   Rectangle(int x, int y, int w, int h)
	   {
	      this.x = x;
	      this.y = y;
	      this.w = w;
	      this.h = h;
	   }

	   // For brevity, I've omitted getX(), getY(), getWidth(), and getHeight()
	   // methods.

	   @Override
	   void draw()
	   {
	      System.out.println("Drawing rectangle (" + x + ", "+ y + ", " + w + "," +
	                         h + ")");
	   }

}
