package repl.repl_it.repl3;

public class PrintLetterCombinations_91 {

	public static void main(String[] args) {
		/*
		 * Write a loop that displays all possible combinations of two letters 
		 * where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. 
		 * The combinations should be displayed in descending alphabetical order:
		 */
		
		for(char letter = 'z'; letter>='v'; letter--) {
			
			for(char ch = 'z'; ch>='v'; ch--) {
				System.out.println(letter + "" +ch );	
				
			}
		}
	}

}
