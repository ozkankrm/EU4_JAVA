package javaeu4.day19_StringClass_Manipulation;

public class String_Contains {

	public static void main(String[] args) {
		
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));// return true
		
		boolean b1 = email.contains(".");
		System.out.println(b1); // true
		
		email = "name@yahoo.com";
		
		if(email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		}else if(email.contains("@gmail")) {
			System.out.println("Gmail account");
		}else if(email.contains("@hotmail."))
			System.out.println("Hotmail account");
		
		String list = "potato, tomatoes,eggs,brak,cereal,meat,apples";
		
		if(list.contains("apples")) {
			System.out.println("Apples are in your list");
		}else {
			System.out.println("Apples are not in your list");
		}
		
		boolean hasEggs = list.contains("eggs");
		System.out.println("Contains eggs: " +hasEggs);
		
		boolean hasCucumber = list.contains("cucumber");
		System.out.println("Contains cucumber: " + hasCucumber);
		
		
		
		
//		really work example
		String etsyTitle = "Car | Etsy";
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
		
//		reall work example
		String searcItem = "computer";
		String title = "Amazon.com: computer";
		
		if(title.contains(searcItem)) {
			System.out.println("pass");
		}
	}
	



}
