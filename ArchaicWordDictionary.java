import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
/**
 * Class to read a dictionary file and implement a hash map
 * @author Matt Rice
 * @version 11-10-22
 * ArchaicWordDictionary
 * Fall 2022
 */
public class ArchaicWordDictionary  {
	//Instance variable
	HashMap<String , String> archaicWords;
	
	
	/**
	 * Creates a constructor that will use a hashmap to implement a dictionary
	 */
	public ArchaicWordDictionary() {
		 archaicWords = new HashMap<String , String>();
	 }//end ArchaicWordDictionary
	/**
	 * Fills the dictionary with the contents of the file that is entered in the path
	 * @param path the file path of the file to be read
	 * @throws IOException will be thrown if the file path is not found
	 * @returns void
	 */
	public void fillDictionary(String path) throws IOException{
		File infile = new File(path);
		Scanner scan = new Scanner(new FileReader(infile));
		
		while(scan.hasNext()) {
			 String wordAndDef = scan.nextLine();
			 int tabIndex = 0;
			 tabIndex = wordAndDef.indexOf('\t');
			 String key = wordAndDef.substring(0, tabIndex);
			 String value = wordAndDef.substring(tabIndex+1);
			 archaicWords.put(key, value);
		}//end while that puts keys and values into the hashmap
	}//end fillDictionary
	/**
	 * Prints the values stored within the dictionary hashmap
	 * @return void
	 */
	public void printDictionary() {
		System.out.println(archaicWords);
	}//end printDictionary
	/**
	 * Prints the definition of the entered key and its associated hashCode
	 * @param key the key that the user wants the definitnion of
	 */
	public void getDefinition(String key) {
		System.out.println(key + ": " + archaicWords.get(key) + " " + key.hashCode());
	}//end getDefinition
	
}//end ArchaicWordDictionary
