package javaeu4.day19_StringClass_Manipulation;

public class String_CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "computer";
		
		System.out.println(word.length());// 8
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
//		System.out.println(word.charAt(8)); // bu da yazarsak hata verir. index out of range hatas� verir

//	if first character is 'A'
		String word2 = "Apple";
		
		if(word2.charAt(0) == 'A') {
			
			System.out.println("A is first character");
			
		}else {
			System.out.println("A is not first character");
		}
		
		
//		check if first and last character are same
		String word3 = "civic";
		
		if(word3.charAt(0) == word3.charAt(4)) {
			System.out.println("First and last character are same");
		}else {
			System.out.println("First and last character are not same");
		}
//	second way
		
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		
		if(first == last) {
			
		System.out.println("First and last character are same");
	}else {
		System.out.println("First and last character are not same");
	}
		
//		last index not hard coded.
		String word4 = "Java";
		
		char lastChar = word4.charAt(word4.length()-1);  //uzunluktan bir ��kard���m�zda son harfi buluruz
	
		System.out.println("Last char of " + word4 + " is " + lastChar);
	}

}
