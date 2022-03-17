package repl.repl_it;

import java.util.Scanner;

public class VerifyContains_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program that will verify if word contains in the sentence. 
//		Print out the result as boolean value. 	

		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter a word");
		    String word = scan.nextLine();
		    
		    System.out.println("Enter a sentence");
		    String sentence = scan.nextLine();
		    //WRITE YOUR CODE HERE
		    
		    System.out.println(sentence.contains(word));
	
	
	}

}
