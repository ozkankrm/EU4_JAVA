package repl.repl_it.repl3;

public class MethodsWithString14_Palindrome_2003 {

	public static void main(String[] args) {
		/*
		 * Palindrome is a word, phrase, or sequence that reads the same backward as forward, 
		 * e.g., madam or nurses run.

So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

- make your conditions case insensitive.  ex: Civic and civic are both palindromes
- make your conditions space insensitive.  Race car is a palindrome even though there is space in between.

Examples:

isPalindrome("Noon") ==> true

isPalindrome("I am not palindrome") ==> false

isPalindrome("wooden") ==> false

isPalindrome("Nurses Run") ==> true
		 */

		System.out.println(isPalindrome("Noon"));
		System.out.println(isPalindrome("I am not palindrome"));
		System.out.println(isPalindrome("wooden"));
		System.out.println(isPalindrome("Nurses Run"));
		
		
	}
	
	
	
	 public static boolean isPalindrome(String check) {
		 
		 String result = "";
		 check = check.replace(" ", "");

		 for(int i=check.length()-1; i>=0; i--) {
			 
			 result += check.charAt(i);
		 }
		 

		return check.equalsIgnoreCase(result);
		
		
		 
		    
	  }

}
