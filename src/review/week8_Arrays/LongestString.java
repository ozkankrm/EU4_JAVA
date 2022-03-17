package review.week8_Arrays;

public class LongestString {

	public static void main(String[] args) {
		/*
		 *  Create a method that will accept a String array and return a String which is the biggest word
		 *   in the whole array. The words will all have different lengths 
    Ex: [ "Monday", "Apple", "Banana", "Strawberry", "Lion" ] -> Strawberry
		 */
		
		String [] str = {"a", "b", "edf", "abnk��h"};
		System.out.println(findLongestWord(str));

	}
	public static String findLongestWord(String[] words) {
		
		String longestWord = "";
		
		for(String wor : words) {
			
			if(wor.length() > longestWord.length()) {
				
				longestWord = wor;
			}
		}
		
		return longestWord;
		
		
	}
	
	

}
