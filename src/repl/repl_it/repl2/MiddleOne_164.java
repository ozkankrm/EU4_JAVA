package repl.repl_it.repl2;

import java.util.Scanner;

public class MiddleOne_164 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		    
		    String dummy = "";
		    
		    if(word.length()==1){
		 
		    dummy = word.substring(0).concat(word.substring(0).concat(word).substring(0));
		    System.out.println(dummy);
		 
		    }
		    if(word.length()%2!=0 && word.length()>=3) {
		    	dummy =word.substring(word.length()/2, word.length()/2+1);
		    	System.out.println(dummy);
		    }
		    if(word.length()==2) {
		    	dummy = word.substring(0).concat(word.substring(0));
		    	System.out.println(dummy);
		    }
		    if(word.length()%2==0 && word.length()>=4) {
		    	dummy = word.substring(word.length()/2-1, word.length()/2+1);
		    	System.out.println(dummy);
		    }
		

	}

}
