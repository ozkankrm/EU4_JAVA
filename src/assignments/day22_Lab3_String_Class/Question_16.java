package assignments.day22_Lab3_String_Class;

public class Question_16 {

	public static void main(String[] args) {
		/*
		 * Given a string, return a string length 2 made of its first 2 chars. 
		 * If the string length is less than 2, use '@' for the missing chars.
atFirst("hello") --> "he"
atFirst("hi") --> "hi"
atFirst("h") --> "h@"
		 */

		String str = "hello";
		
		if(str.length()<2){
			
			System.out.println(str.substring(0).concat("@"));
		}
		if(str.length()>=2) {
			System.out.println(str.substring(0, 2));
		}
	}

}
