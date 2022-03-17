package repl.repl_it.repl2;

import java.util.Scanner;

public class MergeThem_66 {

	public static void main(String[] args) {
		/*
		 * You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:

aok
lol
alookl

ear
pie
epaire

java
wow
cannot merge

hint:
by inserting +""+ (empty string) between chars, you can concatenate char values.
		 */

		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		
		    String dummy = "";
		    if(word1.length()==3 && word2.length()==3) {
		    	
		    	for(int i=0; i<3; i++) {
		    		
		    	dummy = dummy + word1.substring(i, i+1).concat(word2.substring(i, i+1));     								
		    }
		    	 System.out.println(dummy);  
		    	 
		    }else if(word1.length()!=3 || word2.length()!=3){
		    	System.out.println("cannot merge");
		    }
		   
		
		
		
		
		
		
	}

}
