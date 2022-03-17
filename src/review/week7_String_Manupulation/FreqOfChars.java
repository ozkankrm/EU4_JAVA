package review.week7_String_Manupulation;

public class FreqOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*write a program that can return the frequency of each letter in the given string
		input: "ABBBCCDEE";
		OUTPUT: A:1
				B:3
				C:2
				D:1
				E:2
		*/
		
		freqOfChar("abccccaaab");
		
	}
	public static void freqOfChar(String str) {
		
		String checked=""; 
		
		for(int i=0; i<str.length(); i++) {
			
			char eachChar = str.charAt(i); // eachChar will be the character and index 'i'
			int count = 0;
			
			if(checked.contains("" + eachChar)) {
			continue;
			}
			for(int j=0; j<str.length(); j++) { // this loop iterates through the string, but this loop will
												// run from beginning to end for each iteration of the i look
				
				char eachInner = str.charAt(j);
				if(eachChar==eachInner) {
					count++;
				}
				
//				System.out.println("i "  + i);
//				System.out.println("j " + j);
//				System.out.println();
			}
			System.out.println(eachChar + ": " + count);
			checked += eachChar;
		}
	}
	
	
	

}
