package review.week10_StringArraysReturnMethodArrayList;

public class StringPractice4_FrequencyWord {

	public static void main(String[] args) {
		/*
		 * Frequency of word
		 * 
		 *sentence =  "I love java, Java is cool, jAvA is fun"
		 * 
		 * word = "java"
		 * 
		 * how many  word incide sentence
		 */
		
		String sentence = "I love java, Java is cool, jAvA is fun";
		sentence = sentence.toLowerCase();//all character lowercase
		
		String word = "	JAVA";
		word = word.toLowerCase();; //all character lowercase

		int count = 0;
		
			while(sentence.contains(word)) {
			
			sentence = sentence.replaceFirst(word, "");
			count++;
		}
		
		System.out.println(count);
	}

}
