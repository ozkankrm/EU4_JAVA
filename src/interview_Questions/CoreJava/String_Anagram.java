package interview_Questions.CoreJava;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
		
		String str = "abcd";
		
		String s2 = "adbc";
		
		char[] ch1 = str.toCharArray();
		
		System.out.println(ch1);
		
		System.out.println(str);
		
		Arrays.sort(ch1);
		
		System.out.println(ch1);
		
		

	}
	
	public static boolean anagram(String a, String b) {
		
		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String s1 = "", s2 = "";
		
		for(char each : ch1) {
			
			s1 += each; 
		}
		
		for(char each : ch2) {
			
			s2 += each; 
		}
		
		return s1.equals(s2);
	}

}
