package javaeu4.day19_StringClass_Manipulation;

public class Sting {

	public static void main(String[] args) {
//		String java.lang package i�inde ve bu package otomatik olaraak import oluyor
//		ve haz�r var. bu nedenle import kullanarak i�e aktarmad�k zaten haz�r var


//		literal ile string objecti olu�tma
//		string pool dan check eder varsa ordan kullan�r 
//		yoksa yenisini olu�turur ve string poola koyar
		
		String a = "Orange";
		String str2 = "Table";
		String str3 = "Apple";
		String str4 = "Computer";
		System.out.println(a);
		
//		new keyword kullanarak string object olu�turma
		String str = new String("Apple");
		
	
		
		System.out.println(str);
		
		String firstHelloWorld = new String("Hello World");
		
		System.out.println(firstHelloWorld); // Hello Word
		
	}

}
