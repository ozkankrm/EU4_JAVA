package review.Mat_review.self_review;

import java.util.ArrayList;

public class String_exercise {

	public static void main(String[] args) {
		
		String str ="10/10/2020 14:59:00 "; 
		
		str = str.replace("/", "").replace(" ", "").replace(":","");
		
		System.out.println(str);
	

	}

}
