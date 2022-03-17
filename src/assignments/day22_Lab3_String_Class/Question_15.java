package assignments.day22_Lab3_String_Class;

public class Question_15 {

	public static void main(String[] args) {
		/*
		 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
hasBad("badxx") --Z true
hasBad("xbadxx") --> true
hasBad("xxbadxx") --> false
		 */

//		String str = "badxx"; // 0 and 1
		
//		String str = "xbadxx";
		
		String str = "xxbadxx";
		
		boolean flag = true;
		
		for(int i = 1; i<2; i++) {
			
			if(str.substring(i, i+3).equals("bad")) {
				flag = true;
//				System.out.println(true);
				break;
			}else {
				flag = false;
//				System.out.println(false);
			}
			
			if(flag) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
	}

}
