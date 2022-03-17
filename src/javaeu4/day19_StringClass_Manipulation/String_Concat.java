package javaeu4.day19_StringClass_Manipulation;

public class String_Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="Hello ";
		String s2 = "World";
		String s3 = s1.concat(s2); // s1 + s2 gibi d���n concat ile ba�lanm��
		
		System.out.println(s3);// Hello World
		
//		
		String word = "Java";
		
		System.out.println(word.concat(" + Selenium"));
		
		System.out.println(word);// Java
		
		word = word.concat("+ Eclipse"); // reassign to word
		System.out.println(word); // Java + Eclipse
		
		word = word.concat(" Automation"); //reassign
		System.out.println(word); // Java + Eclipse Automation
		
//		word = word.concat(123); i�ine rakam(int) yaz�nca kabul etmez sadece string kabul eder.

			word = word + 123; // string + int = string // reassign to word
			System.out.println(word);//Java+ Eclipse Automation123
			
			word = word + true; // reassign to word
			System.out.println(word);//Java+ Eclipse Automation123true
			
			
			String word2 = "Hi";
//			istedi�in kadar ekleme yapabilirsin. concat() kullanarak
			word2 = word2.concat("-hey").concat("-how are you").concat("-good");
			
			System.out.println(word2);
			
			
			
			
			
			
	}

}
