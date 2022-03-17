package review.Mat_review.self_review_stringtask;

public class String_Task1 {

	public static void main(String[] args) {

		/* Given a string with any possible length including 0 print first 2 characters only 
		 * if the string has more than 1 character�
		 * if the string is empty print empty string
		 * else print the first char twice in same line
		 * 
		 * ex:
		 * "abcde"-->ab
		 * ""-->empty string
		 * "j"-->jj
		 * 
		 */
		
		
		twoChar("jjggb");
	}
	
	public static void twoChar(String str) {
		
		if(str.length()==0 || str.isEmpty()) {
			System.out.println("empty String");
		}
		if(str.length()==1) {
			str = str+str;
		}
		if(str.length()>=2) {
			str  = str.substring(0, 2);
		}
		
		System.out.println(str);
	}

}
