package repl.rep.it4;

public class MethodsWithString7_at3rdchar_184 {

	public static void main(String[] args) {
		/*
		 * at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"

		 */

		
	}

	public static String at3(String target,String word)
	  {
	   String dummy = ""; 
	    int thirdIndex = target.charAt(3);
	    
	    dummy = target.substring(0, 3).concat(word).concat(target.substring(3));
	    
	    return dummy;
	  }
}
