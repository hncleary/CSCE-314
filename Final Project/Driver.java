import java.io.FileNotFoundException;
import java.util.Queue; 

class Driver
{
        // Test program
    public static void main ( String [ ] args ) throws FileNotFoundException
    {
    	Indexer indexer1 = new Indexer( args[0], args[1]);
    	indexer1.DoIndex();
    	
    	/*
        BinarySearchTree<Integer> t = new BinarySearchTree<>( );
        final int NUMS = 4000;
        final int GAP  =   37;

        System.out.println( "Checking... (no more output means success)" );

        for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
            t.insert( i );

        for( int i = 1; i < NUMS; i+= 2 )
            t.remove( i );

        if( NUMS < 40 )	
            t.printTree( );
        if( t.findMin( ) != 2 || t.findMax( ) != NUMS - 2 )
            System.out.println( "FindMin or FindMax error!" );

        for( int i = 2; i < NUMS; i+=2 )
             if( !t.contains( i ) )
                 System.out.println( "Find error1!" );

        for( int i = 1; i < NUMS; i+=2 )
        {
            if( t.contains( i ) )
                System.out.println( "Find error2!" );
        }
        */
        
    	
    	//initial tree testing
    	
    	/*
    	BinarySearchTree<Word> testTree = new BinarySearchTree<>();
    	Word word1 = new Word("zebra",5);
    	Word word2 = new Word("apple",8);
    	Word word3 = new Word("cobra",7);
    	Word word4 = new Word("abcdefghijk",32);
    	
    	testTree.insert(word1);
    	testTree.insert(word2);
    	testTree.insert(word3);
    	testTree.insert(word4);
    	
    	word1.addLineNumbers(7);
    	word1.addToCount();
    	word4.addLineNumbers(7);
    	word4.addToCount();
    	
    	testTree.printTree();
    	String test = "been...................1:";
    	System.out.println("Length of String: " + test.length());
    	*/
    	//
    	
    	//System.out.println( indexer1.getIndexMap().containsKey("") ) ;
    	//
    	/*
    	String test = "-apple           ";
    	String testFirst = test.substring(0, 1);
    	if(testFirst.equals("'")) {
    		test = test.substring(1,test.length());
    	}
    	if(testFirst.equals("-")) {
    		test = test.substring(1,test.length());
    	}
    	System.out.println(test);
    	*/
    	
    	
    	//String filterFile = args[0];
    	//String indexFile = args[1];
    	//System.out.println(filterFile);
    	//System.out.println(indexFile);
    	//Indexer indexer1 = new Indexer("C:\\Users\\Hunter\\eclipse-workspace\\CSCE 314 Final Project\\src\\gsl.txt" , "C:\\Users\\Hunter\\eclipse-workspace\\CSCE 314 Final Project\\src\\input1.txt");
    	//indexer1.DoIndex();
    	
    	//indexer1.FileExists(indexer1.getFilterfile());
    	//indexer1.FileFilterReader( indexer1.getFilterfile() );
    	//indexer1.getFilteredBST().printTree();
    	//System.out.println( indexer1.formatString("Whats! !up") ) ;
    	//indexer1.outputFilterMap();
    	//indexer1.FileExists( indexer1.getDatafile() );
    	//indexer1.FileWordReader( indexer1.getDatafile() );
    	//indexer1.outputIndexMap();
    	//indexer1.getIndexedBST().printTree();
    	
    	//System.out.println( indexer1.getIndexedBST().TreeToString() );
    	//Indexer indexer2 = new Indexer("C:\\Users\\Hunter\\eclipse-workspace\\CSCE 314 Final Project\\src\\gsl.txt" , "C:\\Users\\Hunter\\eclipse-workspace\\CSCE 314 Final Project\\src\\input1.txt");
    	//indexer2.FileFilterReader( indexer2.getFilterfile() );
    	//indexer2.getFilteredBST().printTree();
    
    }
}