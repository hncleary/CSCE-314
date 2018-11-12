package abstraction;

import java.util.Date;

public class SalariedEmployee extends Employee
{
	private double salary; //annual

	public SalariedEmployee(String name, Date hireDate, double salary)
	{
		super(name, hireDate);
		this.salary = salary;
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

