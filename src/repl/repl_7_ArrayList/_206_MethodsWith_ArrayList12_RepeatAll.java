package repl.repl_7_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;



public class _206_MethodsWith_ArrayList12_RepeatAll {

	public static void main(String[] args) {
		/*
		 * Create a static method that:
is called repeatAL
returns nothing
takes in a single parameter - an ArrayList of Booleans

This method should modify its ArrayList parameter by repeating its ArrayList values.  

For example, if the parameter is 
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)
		 */

		ArrayList<Boolean> b1 = new ArrayList<>();
		b1.add(true);
		b1.add(false);
		b1.add(false);
		
		repeatAl(b1);
	}
	public static void repeatAl(ArrayList<Boolean> bol){
		
		int count = bol.size();
		for(int i=0; i<count; i++) {
			
			bol.add(bol.get(i));
		}
		System.out.println(bol);
	}

}
