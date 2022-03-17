package interview_Questions.CoreJava;

public class Reverse_String {

	public static void main(String[] args) {
		
		String s = "Mustafa"; //8
		reverseString(s);
		
		String s2 = "Dragon";
		
		//  Dragon
		//  012345
		//  n
		
		System.out.println(s2.charAt(5));
		
		System.out.println(reverseString(s));
		System.out.println(reverseString(s2));
		

	}
				// void	
	public static String reverseString(String str) {
		
		String result = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			result += str.charAt(i);
			
			
				
		}
		
		return result;
		
	}
	
	public static void reverse(String str) {
		
		String result = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			result += str.charAt(i);
				
		}
		
	}

}
