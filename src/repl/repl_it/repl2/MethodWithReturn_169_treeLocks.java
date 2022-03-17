package repl.repl_it.repl2;

public class MethodWithReturn_169_treeLocks {

	public static void main(String[] args) {
//		
//This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
//
//		It returns true only if both a and b are true or c is true.
//
//		https://en.wikipedia.org/wiki/Truth_table
//		 
		boolean bol = threeLocks( true, true, false);
		
		System.out.println(bol);
	}
	
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
	    
		return ((a==true && b==true) || c== true);
		
//		return (a && b ) || c; // bu �ekilde de �al���r
		
		
	  }//end threeLocks

}
