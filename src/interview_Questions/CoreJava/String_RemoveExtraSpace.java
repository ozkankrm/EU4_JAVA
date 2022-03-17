package interview_Questions.CoreJava;

public class String_RemoveExtraSpace {
	
	/*
    Remove All Extra Space from String
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java

     */

	public static void main(String[] args) {
		

	}
	
	public static String removeExtraSpace(String sentence) {
		
		String[] str = sentence.trim().split(" ");
		
		System.out.println(str);
		
		
		return "";
	}

}
