package repl.repl_5_Arrays;

import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {


		  Scanner scan = new Scanner(System.in);
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
		
	String shortestWord = str[0]+1;
	
	for(int i=0; i<str.length; i++) {
		
		if(str[i].length() < shortestWord.length() ) {
			
			shortestWord = str[i];

		}		
	}
	System.out.println(shortestWord);
	

	}

}
