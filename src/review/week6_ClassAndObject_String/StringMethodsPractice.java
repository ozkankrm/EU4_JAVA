package review.week6_ClassAndObject_String;

public class StringMethodsPractice {

	public static void main(String[] args) {
		/*
		 * equals
equalsIgnoreCae
toUpperCase
toLowerCase
contains

trim
charAt
concat
isEmpty
indexOf
replace

subString
		 */
		
		String message = "Java is Awesome!!";
		System.out.println("Initial value of message \n " + message);
//		message.length(); // b�yle b�rakrs�k etki etmez
//		int count = message.length();
//		System.out.println("How many character we have? " + count);
//		
//		System.out.println("How many character we have? " + message.length());
		
		//upperCae or Lower Case kullan�rken eski value yu de�i�tirmez yeni value olu�turur
		message = message.toUpperCase();
		System.out.println("After using uppercase method in abovee line \n " +message);
		
		String str = "abc ";
		System.out.println("str has character count : " + str.length());
		
		System.out.println("is <abc> equal <abc> " + str.equals("abc"));// false
		//false// str daki abc de bo�luk var ve farkl� objeler oluyorlar
//		waht if i did not care about the leading or training space
		
//		save the trimmed result in new variablr
		String str2 = str.trim();
		System.out.println("the result after trimming " + str2.equals("abc")); // true
		
//		compare str2 with ABC without caring about the case
		System.out.println("check str2 is ABC caseInsensitive "
							+ str2.equalsIgnoreCase("ABC"));

//		Contain : partial check
//		
		System.out.println("Does str1 contains letter a: " + str.contains("a"));//true
		System.out.println("Does str1 contains letter A: " + str.contains("A"));//false
//		checking something contain something else in case insensitive manner
		System.out.println("Does str1 contains letter A or a case insensitive: " 
								+ str.toUpperCase().contains("A"));
//			char	012345	
		String s1 = "Hello";
//			length	 12345
//		caharAt() accept index as number return the character at that location
//		start zero-0- 
		System.out.println("first character: " + str.charAt(0));
//		find last character: index of last character is always 1 less that character count
		int lastIndex = s1.length()-1;
		System.out.println("index of the last character is " + lastIndex);
		
		System.out.println("last character is " +s1.charAt(lastIndex));
		System.out.println("last character is " +s1.charAt(s1.length()-1));
		
//		shorcut //for last character
		char lastChar = s1.charAt(  s1.length()-1      );
		System.out.println(lastChar);
		
		System.out.println("check whether s1 is empty " + s1.isEmpty()  );
		
		String s2 = "";// not character inside and empty
		System.out.println("check whether s2 is empty " + s2.isEmpty()  );
		
//		String s3 = null;
//		System.out.println("check whether s3 is empty " + s3.isEmpty()  );
		
//		indexOf
		String s4 = "EU4 is Awasome!";
//		find the location | position |index of A
		System.out.println("Position of A is " + s4.indexOf("A"));
		System.out.println("Position of A is " + s4.indexOf('A'));
//		what if it does not exist
		System.out.println("Position of Z is " + s4.indexOf("Z"));//yoksa -1 e return olur
		
//		find the location | position |index of som
		System.out.println("Position of som is " + s4.indexOf("som"));// ilk characterin indexini al�r
		
		

	}

}
