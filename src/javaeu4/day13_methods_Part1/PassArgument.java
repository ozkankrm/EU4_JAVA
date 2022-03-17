package javaeu4.day13_methods_Part1;

public class PassArgument {

	public static void main(String[] args) {
		
		
       displayValue(10);
       
       int x=5; // e�er burda atamam��sak burdaki variablename ile method i�indeki ayn� olmasa da �al���r
       displayValue(x); // 5 yazd�r�r ve num yerine ge�er di�er i�lemleri de yapar
       displayValue(x*4); //40 yazd�r�r ve sonraki ad�mlar num 40 olarak di�er i�mlemleri yapar
	}
	
	public static void displayValue(int num) { // parantez i�ine declare yap�yorsun sonra �a��r�rken de�er veriyorsun
//										parantez i�ine de�er verdi�inde �a��r�rken mutlaka de�er vermek laz�m
//										yoksa hata verir
		System.out.println("The value is " + num); //10 burda i�lemler yapabiliriz
		System.out.println("The value is " + num*2);
		System.out.println("The value is " + (num+2));
	


	}
	
	
}
