package assignments.day22_Lab3_String_Class;

public class Question_17 {

	public static void main(String[] args) {
	
		/*
		 * Write a method that accepts a string
and returns true if the string is
palindrome.
		 */
		
//	A palindrome is a word, phrase, verse, or sentence  that reads the same forward or backward.
//  racecar --> bu kelimeyi 
		
		String str = "madam";
	
		String str2 = "mom";
		
		String dummy = "";
		
//		forwardString.equalas(backwardString) = true
		
//		     m + a + d + a + m --> tersten check ediyoruz
//			 4   3   2   1   0		
		
//		     m + o + m --> tersten check ediyoruz
//		     2   1   0
		
//		tersten gelece�imiz i�in i lengt uzunlu�undan ba�lar ve s�f�ra do�ru gelir
		for(int i = str.length()-1; i>=0; i--) {
			
			dummy = dummy + str.charAt(i);// "" +m  
										  // m + a = ma
										  // ma + d = mad
			
		}
		
		if(str.equals(dummy)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
		
		
		
		
		
	}

}
