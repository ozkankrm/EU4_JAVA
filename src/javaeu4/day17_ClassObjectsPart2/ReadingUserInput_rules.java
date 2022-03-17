package javaeu4.day17_ClassObjectsPart2;

import java.util.Scanner;

public class ReadingUserInput_rules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. create a Scanner using the InputStream available
		Scanner  keyboard = new Scanner(System.in);
		
//		2. Don't forget to prompt the user
		System.out.println("Type some data for the program: ");
		
//		3. Use the Scanner to read a line of text from the user.
		String input = keyboard.nextLine();
		
//		4. Now, you can do anything with the input string that you need to.
//		Like, output it to the user.
		System.out.println("input = " +input);
		
		
		
		
		
		
		
		
	}

}
