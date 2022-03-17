package repl.repl_it.repl3;

import java.util.Scanner;

public class PrintLetters_96 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	   
	
	    System.out.println(alphabe(start, end));
	  }
	  
	  public static char alphabe(char start, char end){
	    char letter;
	    for(letter=start; letter<end; letter++ ){
	      
	      System.out.print(letter);
	    }
	    return letter;
	}

}
