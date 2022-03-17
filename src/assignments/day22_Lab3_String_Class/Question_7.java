package assignments.day22_Lab3_String_Class;

public class Question_7 {

	public static void main(String[] args) {
		/*
		 * Given 2 strings, a and b, return a string of the form short+long+short,
with the shorter string on the outside and the longer string on the
inside.
comboString("Hello", "hi") --> "hiHellohi"
comboString("hi", "Hello") --> "hiHellohi"
comboString("aaa", "b") --> "baaab"
		 */

		System.out.println(comboString("Hello", "hi"));
		System.out.println(comboString("hi", "Hello"));
		System.out.println(comboString("aa", "b"));
		System.out.println(comboString("Java", "hi"));
		System.out.println(comboString("Hello", "Coding"));
		
	}
	
	public static String comboString(String s1, String s2) {
		
		String str = "";
		if(s1.length()>s2.length()) {
			str = s2.concat(s1).concat(s2);
		}else if(s2.length()>s1.length()) {
			str =  s1.concat(s2).concat(s1);
		}
		return str;
		
	}

}
