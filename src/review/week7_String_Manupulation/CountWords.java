package review.week7_String_Manupulation;

public class CountWords {

	public static void main(String[] args) {
		/*
		 * *write a program that can return the frequency of th word from a sentence
ex:
�nput: "java javascript and css java and datebase, java"
output:4
		 */
		
// common idea: while loop ile ��zmek daha yayg�n
//		 as long as my sentence contains
	
		System.out.println(countWord("java javascript and css java and datebase", "java"));
		
	}
public static int countWord(String str, String word) {
		
		int count = 0;
		
		while(str.contains(word)) {
			
			count++;
			
			
			str = str.replaceFirst("java", "");
			
		}
		
		return count;
		
		
	}
	

}
