package assignments.day22_Lab3_String_Class;

public class Question_10 {

	public static void main(String[] args) {
		/*
		 * Given a string, return true if the first 2 chars in the string also appear at
the end of the string, such as with "edited".
frontAgain("edited") --> true
frontAgain("edit") --> false
frontAgain("ed") --> true
		 */
		
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("ed"));

	}
	public static String frontAgain(String str) {
		
		String first2 = str.substring(0, 2);
		String last2 = str.substring(str.length()-2);
		
	if(first2.equals(last2)){
		return "true";
	}else {
		return "false";
	}
	
	//second way
//	return first2.equals(last2);
		
		
	}
}
