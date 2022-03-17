package repl.rep.it4;

public class MethodsWithString1_MergeThem_178 {

	public static void main(String[] args) {
		/*
		 * When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   
Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
		 */

		
	System.out.println(mergeStrings("wooden", "spoon"));
	System.out.println(mergeStrings("12345", "abcdef"));
	System.out.println(mergeStrings("oh", "no"));
		
	}
	public static String mergeStrings(String one, String two) {
	    
		String result = "";
		if(one.length()>two.length() ) {
		for(int i=0; i<one.length()-1; i++) {
			for(int j=i; j<=i; j++) {
				System.out.print(one.substring(i, i+1));
			}
			for(int k=i; k<=i; k++) {
				System.out.print(two.substring(k, k+1));
			}
		}
		}
		
		if(two.length()>one.length() || two.length()==one.length() ) {
			for(int i=0; i<two.length()-1; i++) {
				for(int j=i; j<=i; j++) {
					System.out.print(one.substring(i, i+1));
				}
				for(int k=i; k<=i; k++) {
					System.out.print(two.substring(k, k+1));
				}
			}
			}
		
		return result;
	   
	    
	  }
}
