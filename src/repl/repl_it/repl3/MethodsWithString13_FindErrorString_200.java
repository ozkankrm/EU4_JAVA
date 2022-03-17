package repl.repl_it.repl3;

public class MethodsWithString13_FindErrorString_200 {

	public static void main(String[] args) {
		/*
		 * isError method checks if the line of string it gets has the word error at the start of it.

it gets a string and returns a boolean.
true if it found the word 'error' an the start of the line string

example use:

isError("foo bar")
returns : false

isError("error foo bar")
returns : true

isError("error one two")
returns : true

isError("three four error")
returns : false
		 */

		/*
		 * System.out.println("abc");
     String cde = "cde";
     System.out.println("abc" + cde);
     String c = "abc".substring(2,3);
     String d = cde.substring(1, 2);
		 */
		
	boolean bol = isError("foo bar");
		System.out.println(bol);
		
	}
	public static boolean isError(String line) {
//		contains error
		
		if(line.contains("error")) {
			if(line.substring(0, 5).equals("error")) {
				return true;
			}else {
				return false;
			}
			
			
		}else {
			return false;
		}
		
		
	    
	  }
	

}
