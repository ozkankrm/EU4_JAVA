package assignments.day22_Lab3_String_Class;

public class Question_11 {

	public static void main(String[] args) {
		/*
		 * Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") --> 1
countHi("ABChi hi")-- 2
countHi("hihi") -- 2
		 */

//		bu soruda genel d���nmek laz�m ve iki�er iki�er check edecek
		
//		System.out.println(countHi("abc hi ho") );
//		System.out.println(countHi("abc hi ho") );
//		System.out.println(countHi("abc hi ho") );
//		System.out.println(countHi("hihi") );
	
		
		
		
		
		String str = "abc hi hohi";
		int counter=0;
	
		for(int i=0; i<str.length()-1; i++){
			
			if(str.substring(i, i+2).equals("hi")) {
				
				counter++;
			}
			
		}
		System.out.println(counter);
			
			/* second way
			 * 
			 * String str="abc hi hohi";
		
		int count=0;
		
		for(int i=0; i<str.length();i++) {
			
			if(str.charAt(i)=='h' && str.charAt(i+1)=='i') {
				 count++;
				 
				 
			}
			
			
		}
		System.out.println(count);
	}
}
			 */
		
			
	}	
	
}

