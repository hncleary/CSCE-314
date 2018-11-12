package abstraction;

import java.util.Date;

public abstract class Employee
{
	private String name;
	private Date hireDate;

	public abstract double getMonthlyPay();
	// abstract since this method will be defined differently in the sub classes
	// both sub-class definitions need to return a double and be of the same name
	
	public Employee(String name, Date hireDate)
	{
		this.name = name;
		this.hireDate = hireDate;
	}

	public boolean samePay(Employee other)
	{
		return (this.getMonthlyPay() == other.getMonthlyPay());
	}

// setters and getters

	public boolean equals(Object obj)
	{
// …
	}
}
