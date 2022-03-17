package repl.rep.it4;

import java.util.*;



public class _210_MethodsWithString16_ReverseLetters {

	public static void main(String[] args) {
		/*
		 * Given a string, that contains special character together
		 *  with alphabets (�a� to �z� and �A� to �Z�), reverse the string in a way that
		 *   special characters are not affected.

 
Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.  
Only subsequence "abc" is reversed.

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

Input:   str = "----qwe--r--tyf...gd.---" 
Output:  str = "----dgf--y--tre...wq.---" 
		 */

		/*
		 String result = reverseLetters("..zxcv..d");
		    System.out.println(result.equals("..dvcx..z")); //true
		    
		    String result2 = Utils.reverseLetters("---abmkl.o-");
		    System.out.println(result2.equals("---olkmb.a-")); //true
		    
		    String result3 = Utils.reverseLetters("---abmkl.o-");
		    System.out.println(result3.equals("-o.lkmba---")); //false
		    */
		reverseLetters();
	}
	
	public static void reverseLetters() {
		
		String str = "..zxcv..d";
		String word = "";
		String reverse = "";
		
		
		for(int i=str.length()-1; i>=0; i--) {
			
			if(Character.isLetter(str.charAt(i))) {
				
				word += str.charAt(i);
			}
			
		}
		
		int j=0;
		for(int i=0; i<str.length(); i++) {
			
			if(Character.isLetter(str.charAt(i))) {
				
				reverse += word.charAt(j);
				j++;
			}
			else {
				
				reverse += str.charAt(i);
			}
		}
		
		System.out.println(reverse);
	}

}
