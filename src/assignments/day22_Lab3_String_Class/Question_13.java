package assignments.day22_Lab3_String_Class;

public class Question_13 {

	public static void main(String[] args) {
		/*
		 * Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") --> "TThhee"
doubleChar("AAbb") --> "AAAAbbbb"
doubleChar("Hi-There") --> "HHii--TThheerree"
		 */
		
//		
//		first way
		String str = "The"; // TThhee substring(0,1) substring(1,2) substring(2,3)
		
		for(int i = 0; i<str.length(); i++) {
				for(int j=0; j<=1; j++) {
				System.out.print(str.substring(i, i+1));
				
		}
		}
		System.out.println();
//		second way --> INTERV�EWDE BU Y�NTEMLE ��ZMEN� BEKLERLER
		String s = "AAbb";
		String newString = "";
		
		for(int i =0; i<s.length(); i++) {
			
		newString = newString + s.substring(i, i+1).concat(s.substring(i, i+1));	
		}
		System.out.println(newString);

	}

}
