package repl.rep.it4;

import java.util.Arrays;

public class _204_MethodWithString15_Anagram {

	public static void main(String[] args) {
		/*
		 *Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed 
		 *from iceman 
		 *isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false
		 */

		
		
	}
	 public static boolean isAnagram(String word1, String word2) {
		
		 /*
		 String dummy = "";
		  
		 word1 = word1.replace(" ", "");
		 word2 = word2.replace(" ", "");
		 
		 for(int i=0; i<word1.length(); i++) {
			 


		dummy = dummy +	 word1.charAt(i);
		 }
		if(word2.contains(dummy)){
			return word2.equalsIgnoreCase(dummy);
		}else {
		  return  false;
		}
		*/
		 
		if(word1.length()!=word2.length()) {
			return false;
		}
		
		//first turn them into array --> short--> compare array eguality
		
		char[] word1Chars = word1.replace(" ", "").toUpperCase().toCharArray();
		char[] word2Chars = word2.replace(" ", "").toUpperCase().toCharArray();
		
		Arrays.sort(word1Chars);
		Arrays.sort(word2Chars);
		
		return Arrays.equals(word1Chars, word2Chars);
		 
	 }	 
}