package interview_Questions.CoreJava;

public class String_isPalindrome {

	public static void main(String[] args) {
		/*
		Write a method that accepts a string
		and returns true if the string is
		palindrome.

			*/
		String s = "madam";
		String s2 = "Java";
		
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome(s2));
		
	}
	
	public static boolean isPalindrome(String str) {
		
		//we write string backwards
		// start last character to first character
		
		
//		first way
	for(int i=0; i< str.length()/2; i++) {
			
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				
				return false;
			}
			
		}
		return true;
		
/*		second way
		String result = ""; // dummy string
		
		for(int i= str.length()-1; i>=0; i--) {
			
			result +=  str.charAt(i);
			
		}
		
		if(str.equals(result)) {
			return true;
		}
		else {
			return false;
		}
	*/	
	}


	}


