package review.Mat_review.self_review;

public class Lab3_Question_13 {

	public static void main(String[] args) {
		/*
		 * Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") -- "TThhee"
doubleChar("AAbb") -- "AAAAbbbb"
doubleChar("Hi-There") -- "HHii--TThheerree"
		 */
		
		String s = "The";
		
		System.out.println(doubleChar(s));

	}
	public static String doubleChar(String str) {
		
		String result = "";

		for(int i=0; i<str.length(); i++) {
			
			result += str.substring(i, i+1).concat(str.substring(i, i+1));
			
		}
		return result;
	}

}
