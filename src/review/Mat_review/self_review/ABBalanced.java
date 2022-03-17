package review.Mat_review.self_review;

public class ABBalanced {

	public static void main(String[] args) {
		/*
		* Write a program that will accept a String and check if the a's and b's in the String are 
	 * balanced. A String is balanced whenever there is an 'a' character and somewhere later 
	 * in the String there is a 'b' character
	
	e�er a dan sonki b varsa balanced 
	yoksa not balanced
		
		�nput : "abcab"
		output: "balanced"
		
		�nput: "bacdf"
		output: "not balanced"
*/
		String s = "abcab";
		System.out.println(balanced(s));
		
	}
	
	public static String balanced(String str) {
		
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == 'a') {
				if(!str.substring(i).contains("b")) {
					return "not balanced";
			}
				
			}
		}
		return "balanced";	
	}

}
