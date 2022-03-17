package javaeu4.day15_methodOverloading;

public class MethodOverloading {

	
	static int num2  = 10;
	public static void main(String[] args) {
		
//		ayn� method ad�n� ba�ka methodda kullan�lmas�d�r
//		method ad� ayn� parametreler farkl�
//		a�a��da sum method ad�na farkl� parametreler verilmi�.
		
	int x =	sum(20, 20,30);
		
		System.out.println(x);
		System.out.println(sum(3, 4, 1, 3));
		
		

	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}

	public static void sum() { // void method da ayn� isimde olabilir. void oldu�u i�in return olmaz.
		System.out.println("hello");
	}
}
