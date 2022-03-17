package interview_Questions.CoreJava;

public class String_CountHi {

	public static void main(String[] args) {
		/*
		 * Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") -- 1
countHi("ABChi hi") -- 2
countHi("hihi") -- 2
		 */

		System.out.println(countHi("abc hi ho")); // -- 1
		System.out.println(countHi("ABChi hi")); // -- 2
		System.out.println(countHi("hihi"));// -- 2
		
		
	}
	
	
	public static int countHi(String str) {
		
		int count = 0;
		for(int i=0; i<str.length()-1; i++) {
			
			if(str.substring(i, i+2).equals("hi")) {
				count++;
			}
		}
		return count;
		
	}

}
