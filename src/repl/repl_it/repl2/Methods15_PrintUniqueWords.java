package repl.repl_it.repl2;

import java.util.Scanner;

public class Methods15_PrintUniqueWords {

	public static void main(String[] args) {
		/*
		 * Complete a void method printUniqueWords() that will print only unique words from an array of strings.
		 *  Every single unique word should be printed from the new line. 

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
		 */
		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    String[] words = new String[size];
		    for(int i=0; i < size; i++){
		      words[i] = scan.next();
		    }
		    printUniqueWords(words);
		  }
		  
		  public static void printUniqueWords(String[] words){
		    //WRITE YOUR CODE HERE
			  
			  for(int i=0; i<words.length; i++) {
				  int count = 0;
				  for(int j=0; j<words.length; j++) {
					  
					  if(words[i].equalsIgnoreCase(words[j])) {
						  count++;
					  }
				  }
				  if(count ==1) {
					  System.out.println(words[i]);
					  }
				 
			  }
			 
			  
			  
		    
		    for(String values  : words){
		      int count = 0;
		     
		      for(String val : words){
		      
		      if(values.equalsIgnoreCase(val)){
		        count++;
		      }  
		      }
		      if(count ==1){
		        System.out.println(values);
		      }
		    }
		    
		  }

}
