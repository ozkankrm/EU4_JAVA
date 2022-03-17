package interview_Questions.CoreJava;

public class Srting_Reverse {

	public static void main(String[] args) {
		
		String s = "ABCDEFG";
		String tas = "Mesut";
		
		reverse(s);
		
		System.out.println(reverse(s));
		
		
	}
	
	
	public static String reverse(String str) {
		
		String dummy = "";
		for(int i = str.length()-1; i>=0; i-- ) {
			
			dummy += str.charAt(i);
			
		}
		
		return dummy;
	}
	

}
