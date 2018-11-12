package Vehicle;

public class Vehicle 
{
	private float speed;

	public float getSpeed() { return speed; }
	public void setSpeed(float speed) { this.speed = speed; }

	public void left() { System.out.println("left"); } ;
	public void right() { System.out.println("right"); } ;
	public void forward() { System.out.println("forward"); } ;
	public void reverse() { System.out.println("backward"); } ;
}
