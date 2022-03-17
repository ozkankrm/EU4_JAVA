package javaeu4.day15_methodOverloading;

public class MethodOverloadingRules {

	public static void main(String[] args) {
//		Overloading Rules

		/*
	1 Number of parameters
		add(int, int)// ayn� method ismi, ayn� data type ama say�lar� farkl�. bu overloadingdir
		add(int, int, int)
	
	2 Data type of parameters 	
		add(int, int) // method ad� ayn� ve data type farkl�d�r
		add(int, float)
		
	3 Sequence of data type parameters
		add(int, float)//data t�rlerinin yeri de�i�tirilebilir
		add(float, int)
		
	4 Invalid Case -->not overloading
		int add(int, int)
		float add(int, int)
		*/
	
		add1(5, 10);
		System.out.println(add1(5, 10));
		System.out.println(add(5, 10));
		System.out.println(add(5, 10));
		System.out.println(add(10, 10));
	}
	
	public static int add1(int a, int b) {
		
		return a+b;
	}
	
	public static int add(int a, float f) {
		return (a*(int)f);
	}
	public static int add(int b, int f1) {
		return (b-f1);
	}

}
