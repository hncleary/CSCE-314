package abstraction;

import java.util.Date;

public class HourlyEmployee extends Employee
{
	private double wageRate; 
	private double hours; //for the month

	public HourlyEmployee(String name, Date hireDate, double wageRate,
			double hours)
	{
		super(name, hireDate);
		this.wageRate = wageRate;
		this.hours = hours;
	}
	
	// setters and getters 

	public boolean equals(Object obj)
	{
// …
	}

	/*
	public String toString()
	{
// …
	}
	*/
	
}

