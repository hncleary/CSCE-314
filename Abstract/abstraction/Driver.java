package abstraction;

import java.util.Date;

public class Driver
{

	public static void main(String[] args)
	{
		Employee Lupoli = new SalariedEmployee("Lupoli", new Date(7,1,2010), 80000);
		Employee Dima = new HourlyEmployee("Dima", new Date(8,18,2013), 50, 10);
		
		System.out.println(Lupoli);
		System.out.println(Dima);
		
	}

}
