package repl.repl_it.repl3;

import java.util.Scanner;

public class EqualsJavaPython_101 {

	public static void main(String[] args) {
		/*
		 * Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
		 */
		
		 Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();
		    
		    int countjava = 0;
		    int countpython = 0;
		    for(int i=0; i<sentence.length()-3; i++) {
		    	
		    	if(sentence.substring(i, i+4).equals("java")) {
		    		
		    		countjava++;
		    	}
		    }
		    for(int i=0; i<sentence.length()-5; i++) {
		    	if(sentence.substring(i, i+6).equals("python")) {
		    		
		    		countpython++;
		    	}
		    	
		    }
		    
		    if(countjava==countpython){
		    	System.out.println(true);
		    }else {
		    	System.out.println(false);
		    }
		    
		    
		    
		    
		    

	}

}
