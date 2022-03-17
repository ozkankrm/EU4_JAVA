package javaeu4.day21_StringManupulation_Part3;



public class String_substring {

	public static void main(String[] args) {
		
		String str = "Welcome to java";
		
		str = str.substring(11);
		System.out.println(str);// java
		
		String sentence = "Java String Manipulationis fun!";
		
		System.out.println(sentence.substring(2)); // jva String Manipulationis fun!
		System.out.println(sentence.substring(5,11));// String
		System.out.println(sentence.length());// 31
		System.out.println(sentence.substring(5, sentence.length()-5));// String Manipulationis
		
//		{{AUTOMATION}}
		String chars = "{{}}";
		String word = "AUTOMATION"; // put the word in the chars
		
		String result = chars.substring(0, 2) + word + chars.substring(2);
		System.out.println(result);// {{AUTOMATION}}
		
		String result1 = chars.substring(0, 2) + word.concat("") + chars.substring(2);
		System.out.println(result1); // {{AUTOMATION}}

	}

}
