package repl.repl_7_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _199_MethodsWith_ArryaList9_RemoveAll {

	public static void main(String[] args) {
		/*
		 * Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord

This method should go through every element of wordList and remove every instance of targetWord
 from the ArrayList.

Example:

ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

now wordList is ["hey","yo"]
		 */
		
		ArrayList<String> arr =  new ArrayList<>(Arrays.asList("hi", "hey", "hi", "yo"));
		removeAll(arr, "hi");

	}
	
	public static void  removeAll(ArrayList<String> wordList, String targetWord){
	
		for(int i=0; i<wordList.size(); i++) {
			
			if(wordList.get(i).equalsIgnoreCase(targetWord)) {
				wordList.remove(targetWord);
				i--;
		}
		}	
		
		System.out.println(wordList);
		
		
/*		wordList.removeAll(Arrays.asList(targetWord));
		System.out.println(wordList); */
	
		
	}
	

}
