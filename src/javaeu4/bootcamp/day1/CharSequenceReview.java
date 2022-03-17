package javaeu4.bootcamp.day1;

public class CharSequenceReview {

	public static void main(String[] args) {


		String string1 = "Cybertek"; // string literal // creating by double quote
		
		String string2 = new String("Cybertek"); // creating by new key word
		
		string1.concat(" School"); // new object created : Cybertek School
		
		System.out.println(string1); // Cybertek
		
		string1 = string1.concat(" School"); 

		System.out.println(string1); //Cybertek School
		
		string2 = string1.concat(" School");
		
		System.out.println("=============================================");
		 
		StringBuilder stringBuilder = new StringBuilder("Cybertek");
		stringBuilder.append(" School");
		stringBuilder.reverse();
		System.out.println(stringBuilder);
		
		
		StringBuffer stringBuffer = new StringBuffer("Cybertek"); //synchronized
		
		System.out.println(stringBuffer);
		
		
		
	}

}
