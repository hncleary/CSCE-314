package GenericsExample;

public class PairDriver 
{

	public static void main(String[] args) 
	{	
		String[] names = { "Walter Hyland", "Kris Darlington", "John Phillips", "John Styles", "Greg Reardon" };
		
		Pair<String, Integer> result = findFirstOccurence(names, "John");
		System.out.println(result);
	}

     // this function should return the value looked for and the index found
	public static Pair<String, Integer> findFirstOccurence(String[] x , String y )
	{
		Integer index = 0;
		String occurrence = "null";
		// you finish!!!
		// what should it return if it does NOT find a match?
		for(int i = 0; i < x.length; ++i) {
			if ( x[i].contains(y) ) {
				index = i;
				occurrence = x[i];
				break;
			}
		}
		
		
		return new Pair<String, Integer>(occurrence , index);
		
		
	}
}
