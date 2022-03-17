package review.week9_ArrayList;

import java.util.ArrayList;

public class ExtractLetters {

	public static void main(String[] args) {
		/*
		 * * Create a method that will accept a String and a boolean.
		 If the given boolean is true then extract the uppercase letters and 
		 return them in an ArrayList.
		 If the given boolean is false then extract all of the lowercase letters
		  and return them in an ArrayList
		 */
		
		System.out.println(extractLetters("kdnLDOkteDLOZHrUbRtI�DwX", true));
		System.out.println(extractLetters("kdnLDOkteDLOZHrUbRtI�DwX", false));

	}
	
	public static ArrayList<Character> extractLetters (String str, boolean check){
		
		ArrayList<Character> letters = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			
			char eachChar = str.charAt(i);
			
		if(check) {
			// uppercase letter
			
			if(eachChar>= 'A' && eachChar<= 'Z') {
				letters.add(eachChar);
				
			}
			
		}else {
			//lowercase letter
			
			if(Character.isLowerCase(eachChar)) {// if(eachChar>= 'a' && eachChar<= 'z')
				letters.add(eachChar);
			}
		}
		}
	return letters;	
	}

}
