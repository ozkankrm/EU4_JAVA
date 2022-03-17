package assignments.day22_Lab3_String_Class;

public class Question_2 {

	public static void main(String[] args) {
	
		/*
		 * Create a method that accepts two strings, a and b, return the result of
putting them together in the order abba, e.g. "Hi" and "Bye" returns
"HiByeByeHi".
makeAbba("Hi", "Bye") --> "HiByeByeHi"
makeAbba("Yo", "Alice") --> "YoAliceAliceYo"
makeAbba("What", "Up") --> "WhatUpUpWhat"
		 */

		System.out.println(makeAba("Hi", "Bye" ));
		System.out.println(makeAba("Yo", "Alice" ));
		System.out.println(makeAba("What", "Up" ));
		
	}
	
	public static String makeAba(String a, String b) {
		
		return a.concat(b).concat(b).concat(a);
	}

}
