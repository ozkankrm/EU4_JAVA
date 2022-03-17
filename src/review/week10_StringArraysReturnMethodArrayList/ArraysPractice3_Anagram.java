package review.week10_StringArraysReturnMethodArrayList;

import java.util.Arrays;

public class ArraysPractice3_Anagram {

	public static void main(String[] args) {
		/*
		 * Anagram	
		same length and same character  (length must be equal)
		s1 = "bac" [b, a, c]
		s2 = "acb" [a, c, b]

		sort s1: [a, b, c]
		sort s2: [a, b, c]
		true
		 */
		
		String s1 = "Silent";
		String s2 = "Listen";
		
//		String s1 = "Silent".toLowerCase();
//		String s2 = "Listen".toLowerCase();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] ch1 = s1.toCharArray(); //[s,i,l,e,n,t]
		char[] ch2 = s2.toCharArray(); // [l,i,s,t,e,n]
		
		Arrays.sort(ch1); //[e, i, ]
		Arrays.sort(ch2);
		
//		System.out.println("Ch1: " + Arrays.toString(ch1));
//		System.out.println("Ch2: " + Arrays.toString(ch2));
		
		boolean isAnagram = Arrays.equals(ch1, ch2);
		System.out.println(isAnagram);
	}

}
