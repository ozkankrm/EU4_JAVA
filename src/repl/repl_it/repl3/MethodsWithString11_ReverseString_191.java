package repl.repl_it.repl3;

public class MethodsWithString11_ReverseString_191 {

	public static void main(String[] args) {
		/*
		 * reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tneduts"
		 */

		String str = reverse("foo");
		System.out.println(str);
	}
	public static String reverse(String input){
	   
		String result = "";
		for(int i= input.length()-1; i>=0; i--) {
			
			result += input.charAt(i); 
		}
		
		return result;
		
	}
	

}
