package assignments.day22_Lab3_String_Class;

public class Question_14 {

	public static void main(String[] args) {
		/*
		 * Given a string, return true if it ends in "ly".
endsLy("oddly") --> true
endsLy("y") --> false
endsLy("oddy") --> false
		 */
	
		
		String s = "oddly";
		
		if(s.length()<2) {
			System.out.println(false);
			return;
		}
		
		if(s.substring(s.length()-2).equals("ly")){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

//		System.out.println(s.substring(s.length()-1)); // last character ->y
//		System.out.println(s.substring(s.length()-2));// last two character-->ly
		
		
		
		
		
//		second way
		String str = "oddly";
		
		if(str.endsWith("ly")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
