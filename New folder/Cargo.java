
public class Cargo extends Jet 
{
	private float tonnage;

	public Cargo(float fuelRemaining, float distanceRemaining, float speed, float currentMPG, String tailNumber,
			float tonnage) 
	{
		super(fuelRemaining, distanceRemaining, speed, currentMPG, tailNumber);
		this.tonnage = tonnage;
	}

	protected float getTonnage() { return tonnage; }
	protected void setTonnage(float tonnage) { this.tonnage = tonnage; }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Cargo))
			return false;
		Cargo other = (Cargo) obj;
		if (Float.floatToIntBits(tonnage) != Float.floatToIntBits(other.tonnage))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Cargo [tonnage=" + tonnage + "]";
	}

	

}
