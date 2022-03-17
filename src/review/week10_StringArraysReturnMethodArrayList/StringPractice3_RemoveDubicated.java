package review.week10_StringArraysReturnMethodArrayList;

public class StringPractice3_RemoveDubicated {

	public static void main(String[] args) {
		/*
		 * remove dublicated characters
		 * 
		 * "aabcca"
		 * -->"abc"
		 */
		//approach str daki elemean� tek tek cehek eder e�er resultta yoksa ekler
		String str = "aabcca";
		
		String result = "";  // "abc"
		
//		String[] arr = str.split("");
							// [a,a,b,c,c,a]
		for(String each :  str.split("")) { // �nce stringi array yapt�k
			
		if(!result.contains(each)) { // e�er string deki element resultta yoksa
			result += each;          // resulta ekle
		}
		}
		
		System.out.println(result);
		
	}

}
