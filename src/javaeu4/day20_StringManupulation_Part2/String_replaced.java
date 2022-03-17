package javaeu4.day20_StringManupulation_Part2;

public class String_replaced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Moscow is a capital of Russia";
		
//		String de Moscow olan her yeri Khimki diye de�i�tirir
		String replaced = str.replace("Moscow", "Khimki");
		
		System.out.println(replaced);
		
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		
		System.out.println(str);
		
		String email = "firstName_lastName@gmail.com";
		String company = "capitalone";
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);
			
		System.out.println(email);
		
	}

}
