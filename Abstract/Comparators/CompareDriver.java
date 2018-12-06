package Comparators;


public class CompareDriver {
	
	public static void main(String[] args) {
		
	
		Animal [] pets = new Animal [4];
		pets[0] = new Dog("Amy", 110);
		pets[1] = new Dog("Eric", 225);
		pets[2] = new Cat("Porche", 23);
		pets[3] = new Cat("Victoria", 17);
		
		Sort.bubbleSort(pets); // will sort by weight (set by Animal compareTo)
		/*
		for(int i = 0; i < pets.length / 2; i++)
		{
		    int temp = pets[i];
		    pets[i] = pets[pets.length - i - 1];
		    pets[pets.length - i - 1] = temp;
		}
		*/
		for(int i = 0; i < pets.length; i++)
		{ System.out.println(pets[i]); }	
	
	}


}
