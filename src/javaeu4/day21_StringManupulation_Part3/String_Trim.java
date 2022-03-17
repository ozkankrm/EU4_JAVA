package javaeu4.day21_StringManupulation_Part3;

public class String_Trim {

	public static void main(String[] args) {
//		trim() methodu stringin u�laar�nda bo�luklar� kald�r��
		
		String str = "    Programming is fun";
		System.out.println(str.trim());//Programming is fun
		System.out.println(str);//     Programming is fun
		
		String s1 = "Programming is fun     ";
		System.out.println(s1.trim());
	
		String s2 = "    Programming is fun    ";
		System.out.println(s2.trim());
	}

}
