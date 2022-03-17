package repl.repl_5_Arrays;

import java.util.Scanner;

public class Arrays_FindingMaxLengthInStringArray_120 {

	public static void main(String[] args) {
		/*
		 * Given the array words, it will print the word with the largest length. 
		 * Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
		 */

		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		
		String result = "";
		int num = 0;
		for(int i=0; i<words.length; i++) {
	
			if(words[0].length()>words[1].length() && words[0].length()>words[2].length() && 
					words[0].length()>words[3].length() &&words[0].length()>words[4].length()) {
				result = words[0];
			}
			if(words[1].length()>words[0].length() && words[1].length()>words[2].length() && 
					words[1].length()>words[3].length() &&words[1].length()>words[4].length()) {
				result = words[1];
			}
			if(words[2].length()>words[1].length() && words[2].length()>words[0].length() && 
					words[2].length()>words[3].length() &&words[2].length()>words[4].length()) {
				result = words[2];
			}
			if(words[3].length()>words[1].length() && words[3].length()>words[2].length() && 
					words[3].length()>words[0].length() &&words[3].length()>words[4].length()) {
				result = words[3];
			}
			if(words[4].length()>words[1].length() && words[4].length()>words[2].length() && 
					words[4].length()>words[3].length() &&words[4].length()>words[0].length()) {
				result = words[4];
			}
			
		}
		System.out.println(result);
		
		
		
		
		
	}

}
