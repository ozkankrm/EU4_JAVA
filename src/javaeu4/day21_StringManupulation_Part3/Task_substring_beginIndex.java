package javaeu4.day21_StringManupulation_Part3;

public class Task_substring_beginIndex {

	public static void main(String[] args) {


		String s1 = "Javascript";
//		substring(beginIndex		
		System.out.println(s1.substring(2)); // vascript
		System.out.println(s1.substring(s1.length()-4)); // ript
		System.out.println(s1.substring(3)); //ascript
		
		
		String str = "Programming is fun";
//		substring(beginIndex, endIndex) // endIndex i�leme dahil edilmez
		System.out.println(str.substring(1,4)); // rog
		System.out.println(str.substring(12,str.length()-4)); // is
		System.out.println(str.substring(4,4)); //
		

	}

}
