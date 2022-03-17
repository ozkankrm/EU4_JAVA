package assignments.day22_Lab3_String_Class;

public class Question_8 {

	public static void main(String[] args) {
		/*
		 * Given a string, return a "rotated left 2" version where the first 2 chars
are moved to the end. The string length will be at least 2.
left2("Hello") --> "lloHe"
left2("java") --> "vaja"
left2("Hi") --> "Hi"
		 */
		
		System.out.println(left2("Hello"));
		System.out.println(left2("Java"));
		System.out.println(left2("Hi"));
		System.out.println(left2("Hello"));
		System.out.println(left2("Hello"));
		System.out.println(left2("Hello"));

	}
	public static String left2(String str ) {
		
		return str.substring(2).concat(str.substring(0, 2));
	}
	

}
