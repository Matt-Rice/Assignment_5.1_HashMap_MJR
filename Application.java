import java.util.*;
import java.io.*;
/**
 * Class to test the methods of the Archaic Word Dictionary Class
 * @author Matt Rice
 * @version 11-10-22
 * Application
 * Fall 2022
 */
public class Application  {
	
	 
	public static void main (String[]args) throws IOException{
		 
		ArchaicWordDictionary archaicWords= new ArchaicWordDictionary();
		
		archaicWords.fillDictionary("DictionaryWordValuePairs.txt");
		
		archaicWords.printDictionary();
		
		archaicWords.getDefinition("brimstone");
		
		archaicWords.getDefinition("wondrous");
		
		archaicWords.getDefinition("sables");
		
		archaicWords.getDefinition("dandiprat");
		
		archaicWords.getDefinition("God's acre");
		
	}//end main
}//end Application
