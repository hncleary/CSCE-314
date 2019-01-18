import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) 
	{
		ArrayList<Cargo> testCargo = new ArrayList<Cargo>();
		testCargo.add(new Cargo(124, 0, 0, 0, "HSD145", 1000 )); // plane just sitting on tarmac, why most is 0
		testCargo.add(new Cargo(5000, 0, 0, 0, "HWY9Q7", 500 )); // plane just sitting on tarmac, why most is 0
		testCargo.add(new Cargo(2400, 0, 0, 0, "QKIE346", 100 )); // plane just sitting on tarmac, why most is 0
		
		
		/*   ***********************  <    #1    > ************************** */
		/*
		// display List before sorting
		displayCargoList(testCargo);
		
		// check to see if sort works
		Collections.sort(testCargo);
		
		// display List after sorting
		displayCargoList(testCargo);	
		*/
		
		/*   ***********************  <    #2    > ************************** */
		/*
		ArrayList<Jet> radar = new ArrayList<Jet>();	
		Passenger example = new Passenger(1288, 230, 250, 0, "JHD723JD", 100);
		radar.add(example);
		radar.addAll(testCargo);
		*/
		
		/*   ***********************  <    #3    > ************************** */
		/*
		displayJetList(radar);
		Collections.sort(radar);
		displayJetList(radar);		
 		*/
		
		/*   ***********************  <    #4    > ************************** */
		/*
		ArrayList<Jet> incoming = new ArrayList<Jet>();	
		incoming.add(new Passenger(2000, 1000, 250, 5, "KJSD3955", 123));
		incoming.add(new Cargo(250, 1000, 250, 5, "JKXD3493", 1234));
		incoming.add(new Cargo(2000, 1000, 250, 2, "JWGS215", 6432));
		incoming.add(new Passenger(500, 900, 250, 5, "MKWO583", 156));
		incoming.add(new Passenger(250, 1050, 250, 4, "KHWS2976", 24));
		incoming.add(new Passenger(1500, 1100, 250, 3, "PQJU3036", 98));
		incoming.add(new Cargo(400, 1000, 250, 5, "WJHF2411", 2345));
		incoming.add(new Cargo(300, 1000, 250, 5, "QUXX5675", 2423));
		
		displayJetList(incoming);			
		// Sort list by fuelRemaining
		Collections.sort(incoming, new CompareFuelRemaining());
		displayJetList(incoming);
		*/
	}

	public static void displayJetList(ArrayList<Jet> list)
	{
		System.out.println("<----- Start of Data ----->");
		for(Jet e : list)
		{
			System.out.println(e.toString());
		}
		System.out.println("<----- End of Data ----->");
	}
	
	// combine both?
	
	public static void displayCargoList(ArrayList<Cargo> list)
	{
		for(Cargo e : list)
		{
			System.out.println(e);
		}
	}
	
}
