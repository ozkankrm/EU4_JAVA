package repl.repl_7_ArrayList;

import java.util.ArrayList;

public class _198_MethodsWith_ArrayList8_CombineAll {

	public static void main(String[] args) {
	/*
	 * Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings
 called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, 
then add all the words (in order) from wordList2.  In other words, it is combining all the elements
 from the two parameters.
	 */

		  ArrayList<String> s1 = new ArrayList<>();
		  s1.add("hello");
		  s1.add("welcome");
		
		  ArrayList<String> s2 = new ArrayList<>();
		  s2.add("bye");
		  s2.add("you");
		  System.out.println(combineAl(s1, s2));
	}
	
	public static ArrayList<String> combineAl(ArrayList<String> wordList1, ArrayList<String> wordList2){
		  
		  ArrayList<String> str = new ArrayList<>();
		  
		  for( String each : wordList1) {
			  str.add(each);
		  }
		  for(String value : wordList2) {
			  str.add(value);
		  }
		  
		  
		  return str;
	}		
}
