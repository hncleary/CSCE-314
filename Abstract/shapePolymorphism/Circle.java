package shapePolymorphism;

public class Circle extends Shape{
	private int x, y, r;

	   Circle(int x, int y, int r)
	   {
	      this.x = x;
	      this.y = y;
	      this.r = r;
	   }

	   // For brevity, I've omitted getX(), getY(), and getRadius() methods.

	   @Override
	   void draw()
	   {
	      System.out.println("Drawing circle (" + x + ", "+ y + ", " + r + ")");
	   }
}
