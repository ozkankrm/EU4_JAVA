package interview_Questions.CoreJava;

public class String_RemoveDublicate {
	
	/*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

	public static void main(String[] args) {


		String s = "ababadcggg";
		
		System.out.println(removeDublicate(s));
		

	}
	
	public static String removeDublicate(String str) {
		
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			
			if(!result.contains(""+ str.charAt(i))) {
				
				result += str.charAt(i);
			}
		}
		
		return result;
		
	}

}
