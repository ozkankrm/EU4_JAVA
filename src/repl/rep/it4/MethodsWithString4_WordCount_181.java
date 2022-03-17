package repl.rep.it4;

public class MethodsWithString4_WordCount_181 {

	public static void main(String[] args) {
		/*
		 * This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1
		 */
		System.out.println(wordCount("foo bar"));
		System.out.println(wordCount("one two three"));
		System.out.println(wordCount("bla"));
		

	}

	public static int wordCount(String words) {
	    
		int count= 0;
		
		for(int i=0; i<words.length()-1; i++) {
			
			if(words.substring(i, i+1).equals(" ")) {
				
				count++;
		
		}
		}
		return count+1;
	      
	  }
}
