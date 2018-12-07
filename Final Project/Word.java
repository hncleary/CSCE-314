import java.util.PriorityQueue;
import java.util.Queue; 

public class Word implements Comparable <Word> {
	private int count;
	public PriorityQueue<Integer> lineNumbers;
	private String wordText;
	
	
	public Word() {
		this.lineNumbers = null;
		this.count = 0;
		this.wordText = null;
		
	}
	//word constructor for filter out words
	public Word(String wordText ) {
		super();
		this.lineNumbers = new PriorityQueue<>();
		lineNumbers.add( 0 );
		this.wordText = wordText;
		this.count = 0;
	}
	
	//word constructor for words in file
	public Word(String wordText, int lineNumber) {
		super();
		this.lineNumbers = new PriorityQueue<>();
		lineNumbers.add(lineNumber);
		this.wordText = wordText;
		this.count = 1;
	}

	//toString function for printing
	@Override
	public String toString() {
		//default toString
		//return "Word [count=" + count + ", lineNumbers=" + lineNumbers + ", wordText=" + wordText + "]";
		String toStringOutput= "";
		int length = String.valueOf(count).length();
		if (count != 0) {
			toStringOutput = toStringOutput + wordText;
			for(int i = 0; i < 24 - wordText.length() - length; i++) {
				toStringOutput = toStringOutput + ".";
			}
			toStringOutput = toStringOutput + count + ": " ;
			//toStringOutput = toStringOutput + lineNumbers.toString();
	  
	        // Creating the array and using toArray() to convert the lineNumbers Priority Queue 
	        Object[] arr = lineNumbers.toArray(); 
	        for (int j = 0; j < arr.length; j++) {
	        	toStringOutput = toStringOutput + arr[j] + " " ;
	        }
		}
		else {
			toStringOutput = wordText;
		}
		return toStringOutput;
	}

	public int compareTo(Word compareWord) {
		//compareTo function for strings
		//compares string value of item to the string value of compareWord 
		return ( this.getWordText().compareTo( compareWord.getWordText() ) );
		
	}
	
	//getters and setters
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void addToCount() {
		this.count = this.count + 1 ;
	}
	
	public Queue<Integer> getLineNumbers() {
		return lineNumbers;
	}

	public void setLineNumbers(PriorityQueue<Integer> lineNumbers) {
		this.lineNumbers = lineNumbers;
	}
	
	
	public void addLineNumbers(int lineNumber) {
		lineNumbers.add(lineNumber);
	}
	

	public String getWordText() {
		return wordText;
	}

	public void setWordText(String wordText) {
		this.wordText = wordText;
	}
	
	
	
}
