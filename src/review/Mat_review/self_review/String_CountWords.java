package review.Mat_review.self_review;

public class String_CountWords {

	public static void main(String[] args) {
		/*
		 * *write a program that can return the frequency of th word from a sentence
ex:
�nput: "java javascript and css java and datebase, java"
output:4
		 */
		
// common idea: while loop ile ��zmek daha yayg�n
//		 as long as my sentence contains

		
		String s = "java javascript and css java and datebase, java";
		
		countWord(s, "java");// 2
		countWord(s, "as");
		
		
		
	}
	
	public static void countWord(String str, String word) {
		
		int count = 0;
		
		while(str.contains(word)) {
			
			str = str.replaceFirst(word, "");
			
			count++;
		}
		
		System.out.println(count);
		
	}

}
