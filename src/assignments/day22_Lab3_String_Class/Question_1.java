package assignments.day22_Lab3_String_Class;

public class Question_1 {

	public static void main(String[] args) {
		/*
		 * Create a method that accepts 1 string, e.g. "Bob", return a greeting of
the form "Hello Bob!".
helloName("Bob") --> "Hello Bob!"
helloName("Alice") --> "Hello Alice!"
helloName("X") --> "Hello X!"
		 */

		System.out.println(helloName("Hello"));
	
		System.out.println(helloName("Bob"));

		System.out.println(helloName("Alice"));

		System.out.println(helloName("X"));
	}
	
	public static String helloName(String str) {
		
		String s1 = "Hello";
		
		return "Hello ".concat(str).concat("!");
	//	return "Hello " + str + "!";
		
		
		
	}

}
