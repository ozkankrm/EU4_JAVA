package review.Mat_review.self_review;

public class Task_79_PrintVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "CybertekSchool";
		
		printVowel(s);
	}
	public static void printVowel(String str) {
		
		String v = "aeiou";
		
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<v.length(); j++) {
			if(str.charAt(i) == v.charAt(j)) {
				
				System.out.print(str.charAt(i));
			}
		}
		}
	}

}
