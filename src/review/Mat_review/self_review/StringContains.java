package review.Mat_review.self_review;

import java.util.Arrays;

public class StringContains {

	public static void main(String[] args) {

		checkedString("Your order confirmation number is XYZ", "confirmation") ;
		
		
	}
	public static void checkedString(String s1, String s2) {
		
		if(s1.contains(s2)) {
			
			int x = s1.indexOf(s2);
			System.out.println(x);
		}
		else {
			System.out.println("not found");
		}
		
	}
	
	
}
