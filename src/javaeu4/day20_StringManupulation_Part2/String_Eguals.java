package javaeu4.day20_StringManupulation_Part2;

public class String_Eguals {

	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to C++";

		boolean b1 = s1.equals(s2); // true
		boolean b2 = s1.equals(s3); // false
		System.out.println(b1 + "|" + b2);
		
		boolean b3 = s1 == s2; // true
		boolean b4 = s1 == s3; // false
		
		System.out.println(b3 + "|" + b4);
		
		String s4 = new String("Welcome to Java");
		System.out.println(s1==s4); // false // burda obje check edilmi�
		System.out.println(s1.equals(s4));//true burda value check eder
	}

}
