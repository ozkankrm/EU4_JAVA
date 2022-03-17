package javaeu4.day20_StringManupulation_Part2;

public class String_indexOf {

	public static void main(String[] args) {
		
		String word1 = "github";
		System.out.println(word1.indexOf("g"));//0 //b�alang�� index numaras�n� verir
		System.out.println(word1.indexOf("th"));//2 // start index number
		System.out.println(word1.indexOf("b")); //5
		System.out.println(word1.indexOf("hub")); // 3
		
//		i�inde yoksa -1 yazd�r�r.
		System.out.println(word1.indexOf("Java"));// -1
		
		String url = "www.okta.com";
		
		int a = url.indexOf("."); // ilk ba�takinin numaras�n� verir
		System.out.println("Post of . " + a);// 3
		
		System.out.println(url.charAt(a+1));// o // char(4) olur ve o harfine kar��l�k gelir
		
//		find position of '-' and check is space is on right and left side
		String title = "Java - Google Search";
		
		int dash = title.indexOf('-');
//		System.out.println(dash);// 5
		System.out.println(title.charAt(dash-1)); //- den �nceki space
		System.out.println(title.charAt(dash+1));//- den sonraki space
		
		System.out.println("Apple");

		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Positon of states: " + states);// 7
		
		
		String word2 = "java, c++, python, tomcat, eclipse";
//		check if c++ in the word2
		
//		first contains
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
//		second
//		indexOf e�er -1 ise kapsam�yor ve �art�m�zz -1 den b�y�k ise kaps�yor demek
		if(word2.indexOf("c++")>-1) {
			
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		
	}

}
