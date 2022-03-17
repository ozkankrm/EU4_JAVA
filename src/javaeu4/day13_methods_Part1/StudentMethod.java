package javaeu4.day13_methods_Part1;

public class StudentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		sayHello(); // method ad�n� parantez ve semi colon ile main methodun i�ine yaz�yoruz ve yzad�r�r
		sayHello();// ayn� methodu istedi�in kadar kullanabilirsin
		sayHello();
		
		code();
		study();
	}
	
	public static void sayHello() {
		System.out.println("Inside sayHello method");
	
	}
	
	public static void code() {
		System.out.println("Student is studying");
	}
	
	public static void study() {
		System.out.println("Student is studying jav");
	}
	

}
