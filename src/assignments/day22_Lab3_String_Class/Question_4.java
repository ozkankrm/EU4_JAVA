package assignments.day22_Lab3_String_Class;

public class Question_4 {

	public static void main(String[] args) {
		/*
		 * Given a string, return the string made of its first two chars, so the String
"Hello" yields "He". If the string is shorter than length 2, return
whatever there is, so "X" yields "X", and the empty string "" yields the
empty string "".
firstTwo("Hello") --> "He"
firstTwo("abcdefg") --> "ab"
firstTwo("ab") --> "ab"
		 */

		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("ab"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("H"));
		System.out.println(firstTwo(""));
		System.out.println(firstTwo("Java"));
	}
	public static String firstTwo(String str) {
		
		if(str.length()<2) {
			return str;
			
		}else if(str.isEmpty() ) {
			return "";
		}
		
		return str.substring(0, 2);
	}

}
