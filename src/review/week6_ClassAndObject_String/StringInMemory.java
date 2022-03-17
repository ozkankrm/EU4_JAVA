package review.week6_ClassAndObject_String;

public class StringInMemory {

	public static void main(String[] args) {
		
//		since String is so common, java allow to creat
//		String object directly using String literal
		
		String s1 = "abc"; // "abc" is Stirng literal
		String s3 = "abc";
		

		System.out.println( s1==s3 );// s1 ve s3 ayn� adress oldu�una bakar
									// this checking if s1 and s3 have same address
									// meaning do tehy point to same object
		
		String s2 = new String("abc");// using new keyword
		System.out.println( s1 == s2);// this is checking wether s1 and s2 has same address
									// to same object
		
		System.out.println(s1.equals(s2));
//		this one is checking wether string objects s1 and s2 pointing has same content!!!
		
//		Strings are objects
//		they are stored in the heap
//		String pool (String Constant Pool)
//		A very special area in the heap to store UN�QUE string literals
		

	}

}
