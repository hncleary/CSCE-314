
public abstract class Jet implements Comparable<Object> 
{
	private float fuelRemaining;
	private float distanceRemaining;
	private float speed;
	private float currentMPG;
	private String tailNumber;
	
	public Jet(float fuelRemaining, float distanceRemaining, float speed, float currentMPG, String tailNumber) 
	{
		this.fuelRemaining = fuelRemaining;
		this.distanceRemaining = distanceRemaining;
		this.speed = speed;
		this.currentMPG = currentMPG;
		this.tailNumber = tailNumber;
	}
	protected float getFuelRemaining() { return fuelRemaining; }
	protected float getDistanceRemaining() { return distanceRemaining; }
	protected float getSpeed() { return speed; }
	protected float getCurrentMPG() { return currentMPG; }
	protected String getTailNumber() { return tailNumber; }
	protected void setFuelRemaining(float fuelRemaining) { this.fuelRemaining = fuelRemaining; } 
	protected void setDistanceRemaining(float distanceRemaining) { this.distanceRemaining = distanceRemaining; }
	protected void setSpeed(float speed) { this.speed = speed; }
	protected void setCurrentMPG(float currentMPG) { this.currentMPG = currentMPG; }
	protected void setTailNumber(String tailNumber) { this.tailNumber = tailNumber; }

	public int compareTo(Object that) 
	{
		Jet x = (Jet) that; // casting

		if (this.getFuelRemaining() == x.getFuelRemaining()) { return 0; }
		else if (this.getFuelRemaining() < x.getFuelRemaining()) { return -1; }
		else { return 1; } // (this.getFuelRemaining() == x.getFuelRemaining())
	}
	
	@Override
	public String toString() {
		return "Jet [fuelRemaining=" + fuelRemaining + ", distanceRemaining=" + distanceRemaining + ", speed=" + speed
				+ ", currentMPG=" + currentMPG + ", tailNumber=" + tailNumber + "]";
	}
	
}
