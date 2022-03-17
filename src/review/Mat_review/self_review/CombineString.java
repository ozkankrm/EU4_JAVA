package review.Mat_review.self_review;

public class CombineString {

	public static void main(String[] args) {
		/*
		 * *write a program taht will take two string and combine them 
		 * ex:
			�nput: "java", "apple"
			output: "jaapvpale"
		 */
		
		combine("java", "apple");

	}
	
//	�nce biggest lengthi bulmak sonr tek forun i�inde if kulland�k ve ko�ul lengthin i den b�y�kl���ne g�re
	public static void combine(String one, String two) {
		
		
		String result = "";
		
		int biggest = (one.length()>two.length() ? one.length() : two.length());
		
		for(int i=0; i<biggest; i++) {
			
			if(i<one.length()) {
				result += one.charAt(i);
			}
			if(i<two.length()) {
				result += two.charAt(i);
			}
		}
		
		System.out.println(result);
		
		
		
		
		
		String dummy ="";
		if(one.length()>two.length()) {
			for(int i=0; i<one.length()-1; i++ ) {
				
			dummy += one.substring(i, i+1) + two.substring(i, i+1);
				
			}
		
		}
		if(two.length()>one.length()) {
			for(int i=0; i<two.length()-1; i++ ) {
				
			dummy += one.substring(i, i+1) + two.substring(i, i+1);
				
			}
		
		}
		System.out.println(dummy);
	}

}
