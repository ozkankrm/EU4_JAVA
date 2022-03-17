package review.week10_StringArraysReturnMethodArrayList;

import java.util.Scanner;

public class StringPractice2_Palindrome {

	public static void main(String[] args) {
		/*
		 * Plaindrome task
		 * reverse is same original is palindrome
		 */
		
		
		String str = new Scanner(System.in).next();

		String reversedStr = ""; // "ketrebyC"
		
		for(int i= str.length()-1; i>=0; i--) {
			
			reversedStr += str.charAt(i);
		}
		System.out.println(reversedStr);
		
		boolean isPalindrome = str.equalsIgnoreCase(reversedStr);
		System.out.println(isPalindrome);
		
	}

}
/*
 * Plaindrome task
 * reverse is same original is palindrome
 * 
 * 
 * 
 */
