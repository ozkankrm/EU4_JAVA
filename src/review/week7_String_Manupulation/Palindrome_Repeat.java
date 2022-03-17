package review.week7_String_Manupulation;

import java.util.Scanner;

public class Palindrome_Repeat {

	public static void main(String[] args) {
		
		System.out.println(isPalindromeee("hello"));
		System.out.println(isPalindromeee("anna"));
		
}
	
//	first way
//	public static boolean isPalindrome(String str) {
//		
//		for(int i=0; i<str.length()/2; i++) {
//			
//			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
//				return false;
//			}
//			
//			
//		}
//		
//		return true;
//	}
	
	
//	second way
	public static boolean isPalindromeee(String s) {
		
		String result = "";
		
		for(int i=s.length()-1; i>=0; i--) {
	
				result += s.charAt(i);		
		}
		if(s.equals(result)) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
}