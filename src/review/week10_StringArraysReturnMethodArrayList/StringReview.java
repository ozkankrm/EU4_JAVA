package review.week10_StringArraysReturnMethodArrayList;

public class StringReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "cyberterk";
		str.toUpperCase(); // "CYBERTEK"
		System.out.println(str); // cyberterk
		
		str = str.toUpperCase(); // reassign yapt�ktan sonra etki eder
		System.out.println(str);// CYBERTERK
		
		String name = "I love Java";
		
		//lastIndexOf()
		String language = name.substring(name.lastIndexOf(" ")+1);
		System.out.println(language);
		
		String s1 = "Cybertek";
		String s2 = new String("Cybertek");
		
		System.out.println(s1==s2);// false
		System.out.println(s1.equals(s2));// true
	}

}
