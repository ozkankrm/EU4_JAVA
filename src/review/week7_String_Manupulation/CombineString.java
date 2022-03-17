package review.week7_String_Manupulation;

import java.util.Scanner;

public class CombineString {

	public static void main(String[] args) {
		/*
		 * *write a program taht will take two string and combine them 
		 * ex:
			�nput: "java", "apple"
			output: "jaapvpale"
		 */

		System.out.println(combineString("java", "apple"));
		System.out.println(combineString("12345", "abcdef"));
		System.out.println(combineString("aaaaaaaaa", "bbbb"));
		
		 
		
	}
	public static String combineString(String one, String two) {
		
		String combined = "";
		int biggest = one.length() > two.length() ? one.length() : two.length();
		
		for(int i=0; i<biggest; i++) {
			
			if(i<one.length()) {
			combined += one.charAt(i);
			}
			
			if(i<two.length()) {
			combined += two.charAt(i);
			}
		}
		
		return combined;
		
		
		
	}

}
