package review.week6_ClassAndObject_String;

public class String_SubString {

	public static void main(String[] args) {
//		             012345678901234
		String s1 = "EU4 is Awesome!";

//		son index dahil de�il
//		substring is used to get part of the string from startin point
//		until right before ending point
		System.out.println("characters between index 7 and right before index 9 is " 
										+ s1.substring(7, 9) );//Aw
		
		System.out.println("characters between index 7 and right before index 9 is " 
				+ s1.substring(1, 8) );// U4 is A
		
//		substring that accept only beginning index
//		bir index varsa kendisinden ba�lar ve kalan�n� da i�leme al�r 
		System.out.println("Get character starting from index 4 till the last one: " 
							+	s1.substring(4));
		
//		Check if there is more than one word in above String
//		print the result out
		System.out.println(s1 + " has more than one word ?? : " + s1.contains(" "));
//		alternatively you can do below using indexOf()
//		contains("something")---> s1.indexOf("someString") != -1
		System.out.println(s1 + " has more than one word ?? : " + (s1.indexOf(" ")!= -1) );
		
//		find out the first word
		int firstSpaceIndex = s1.indexOf(" ");
		String firstWord = s1.substring(0, firstSpaceIndex);
		
		System.out.println("first word is " + firstWord);
		
		
	}

}
