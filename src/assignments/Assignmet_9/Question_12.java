package assignments.Assignmet_9;

import java.util.Arrays;

public class Question_12 {

	public static void main(String[] args) {
		
		String str = "xHiX";
		
		String[] s = str.split("");
		
		if(s[0].equalsIgnoreCase("x")) {
			
		   s[0] = s[0].replace("x", "");
			
			System.out.println(Arrays.toString(s));
		}
		

	}

}
