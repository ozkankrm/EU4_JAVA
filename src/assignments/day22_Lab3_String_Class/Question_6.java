package assignments.day22_Lab3_String_Class;

public class Question_6 {

	public static void main(String[] args) {
		/*
		 * Given a string, return a version without the first and last char, so
"Hello" yields "ell". The string length will be at least 2.
withoutEnd("Hello") --> "ell"
withoutEnd("java") --> "av"
withoutEnd("coding") --> "odin"
		 */

		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("Java"));
		System.out.println(withoutEnd("Coding"));
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("Hello"));
		
	}
	
	public static String withoutEnd(String str ) {
		
		if (str.length()<2) {
			return str;
		}
		
		return str.substring(1, str.length()-1);// length()-1 bu son karakter ve eklenmiyor  
	}
	
	

}
