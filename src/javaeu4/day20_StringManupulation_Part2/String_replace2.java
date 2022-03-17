package javaeu4.day20_StringManupulation_Part2;

public class String_replace2 {

	public static void main(String[] args) {
		
		
		String sentence = "Coding is fun, it is my hobby!!";
		
		String withNoSpace = sentence.replace(" ", "");// aradaki bo�luklar� de�i�tirdik, kald�rd�k
		
		System.out.println(withNoSpace);//Codingisfun,itismyhobby!!
		
		String chang_i = sentence.replace("i", "a");
		System.out.println(chang_i);
		
		String change = sentence.replace(",", "!!!");
		System.out.println(change); // Coding is fun!!! it is my hobby!!
		
		String result = "About 8,930,000,000 results (0.68 seconds)";
		result = result.replace("About ", "").replace("results (0.68 seconds)", "");
		System.out.println(result);
		
		String mixed = "&^@#j$a-v|a@#$";
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		mixed=mixed.replace("$", "").replace("-", "").replace("|","");
		System.out.println(mixed);
		
		
		
		
	}
}
