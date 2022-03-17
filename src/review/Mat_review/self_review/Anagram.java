package review.Mat_review.self_review;

public class Anagram {

	public static void main(String[] args) {

		//listen
		
		//silent
		System.out.println(anagram("silentb", "listenc"));

	}
	public static boolean anagram(String s1, String s2) {
		
		
		if(s1.length() != s2.length()) {
			return false;	
		}
		
		int count = 0;
		for(int i=0; i<s1.length(); i++) {
			for(int j=0; j<s2.length(); j++) {
				
				if(s1.charAt(i) == s2.charAt(j)) {
					count++;
				}
			}
		
			
		}
		
		
		if(count == 0) {
			return false;
		}
		return true;
	}

}
