package Comparators;


import java.util.Scanner;

public class Dog extends Animal
{
	private String bark;

	private static Scanner sc = new Scanner(System.in);
	
	// constructors 
	public Dog(String name) { super(name);}
	public Dog(String name, float weight) { super(name, weight); }

	// setters
	public void setName()
	{
		System.out.println("Please enter your Dog's name:");
		this.name = sc.next(); 
           // access directly to name since protected in super class 
	}

	public void setSound()
	{
		System.out.println("Please enter your Dog's barking sound:");
		this.sound = sc.next();
	}

	public void setFood()
	{
		System.out.println("Please enter your Dog's food:");
		this.food = sc.next();
	}

	public void setWeight()
	{
		System.out.println("Please enter your Dog's weight:");
		this.weight = sc.nextFloat();
	}

	public String toString()
	{
		return "Dog [bark=" + bark + ", name=" + name + ", sound=" + sound
				+ ", food=" + food + ", weight=" + weight + "]";
	}

}


