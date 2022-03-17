package repl.repl_it.repl2;

import java.util.Scanner;

public class Reverse_it_67 {

	public static void main(String[] args) {
		/*
		 * Write a program that will reverse a string. Your program should reverse a string 
		 * only 5 characters long. If word is shorter, display message:
		 *  "Too short!". If word is longer, display message: "Too long!".
		 *   Otherwise, reverse this word and print out result into the console. 
		 */
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		
		String dummy = "";
		
		if(word.length()==5) {
			
			for(int i=word.length()-1; i>=0; i--) {

				dummy = dummy + word.charAt(i);
			}
			System.out.println(dummy);
			
		}else if(word.length()<5) {
			System.out.println("Too short!");
			
		}else if(word.length()>5) {
			System.out.println("Too long!");
		}
		

	}

	

}
