package assignments.day22_Lab3_String_Class;

public class Question_3 {

	public static void main(String[] args) {
		/*
		 * Create a method return a new string made of 3 copies of the last 2
chars of the original string. The string length will be at least 2.
extraEnd("Hello") --> "lololo"
extraEnd("ab") --> "ababab"
extraEnd("Hi") --> "HiHiHi"
		 */
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("I am Java"));
		System.out.println(extraEnd("a"));

	}
	public static String extraEnd(String str) {
		
		if(str.length()<2) {
				return "Invalid String";
		}
		String dummy = "";
		dummy = str.substring(str.length()-2);//
		return dummy+dummy+dummy;
	}

}
