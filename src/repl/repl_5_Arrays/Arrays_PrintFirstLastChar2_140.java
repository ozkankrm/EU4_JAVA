package repl.repl_5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_PrintFirstLastChar2_140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	    String[] newArray = new String[words.length];
	    for(int i=0; i<words.length; i++) {
	    
	    	char first = words[i].charAt(0);
	    	char last = words[i].charAt(words[i].length()-1);
	   
	    	newArray[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length()-1) ;
	    	
	    }
	  
	    System.out.println(Arrays.toString(newArray));
	    
	 
	    
	}

}
