package interview_Questions.CoreJava;

import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) {
		
		String a1 = "silent";
		String a2 = "listenn";
		
		
		System.out.println(anagram(a1, a2));

	}
	
	public static boolean anagram(String s1, String s2) {
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String str1 = "";
		String str2 = "";
		
		for(char each : ch1 ) {
			
			str1 += each;
		}
		
		for(char each : ch2) {
			
			str2 += each;
		}
		
		
		return str1.equals(str2);
		
		
	}

}
