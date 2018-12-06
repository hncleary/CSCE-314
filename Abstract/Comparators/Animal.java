package Comparators;

public abstract class Animal implements Comparable <Animal>
{
	// set all to protected so subclasses have direct-ish access
	protected String name;
	protected String sound;
	protected String food;
	protected float weight;
	
	public Animal(String name)
	{
		this.name = name;
	}
	
	public Animal(String name, float weight)
	{
		this.name = name;
		this.weight = weight;
	}

	public String getName() {return name;}
	public String getSound() {return sound;}
	public String getFood() {return food;}
	public float getWeight() {return weight;}

	// set this to abstract since they may be different depending sub-class
	public abstract void setName();
	public abstract void setSound();
	public abstract void setFood();
	public abstract void setWeight();
	// using abstract here to set a standard
	public abstract String toString();

	public int compareTo(Animal x)
	{
		if(this.getWeight() == x.getWeight()) { return 0; }
		else if(this.getWeight() < x.getWeight()) { return -1; }
		else { return 1; }
	}
	// What values can CompareTo return??

}

