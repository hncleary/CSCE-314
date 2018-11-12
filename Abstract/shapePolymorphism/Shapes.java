package shapePolymorphism;

public class Shapes {
	public static void main(String[] args)
	   {
	      Shape[] shapes = { new Circle(10, 20, 30),
	                         new Rectangle(20, 30, 40, 50) };
	      for (int i = 0; i < shapes.length; i++)
	         shapes[i].draw();
	   }
}
