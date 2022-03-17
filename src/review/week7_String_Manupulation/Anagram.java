package review.week7_String_Manupulation;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * create a method that will accept two strings and determines 
		 * if they are anagrams of each other (return boolean)
		 * --> listen
		 *     silent
		 * -->
		 */

		
		System.out.println(isAnagram("abc", "cab"));
		System.out.println(isAnagram("aaaaaaaa", "cab"));
		System.out.println(isAnagram("listen", "silent"));
	}
	
	public static boolean isAnagram( String one, String two) {
		
		
//		e�er uzunluklar� e�it de�ilse false olur	
		if(one.length()!=two.length()) {
			return false;
		}
		for(int i=0; i<one.length(); i++) {
			two = two.replaceFirst("" + one.charAt(i), "");
		}
		return two.isEmpty();
	}

}
