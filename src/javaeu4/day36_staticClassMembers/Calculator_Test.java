package javaeu4.day36_staticClassMembers;

public class Calculator_Test {

	public static void main(String[] args) {
		
		double result= Calculator.plus(55,7);//static way
		System.out.println(result);
		
		Calculator c= new Calculator();
		System.out.println(c.plus(55, 7));

		int i = Integer.parseInt("33");
		System.out.println(Character.isDigit('5'));
		
		m1();// bu method ayn� classta oldu�ui�in
		Calculator_Test.m1();//ClassName.Methodname
		
		//veya
		Calculator_Test c1 = new Calculator_Test();
		c1.m1();
	}

	public static void m1() {
		System.out.println("Hello");
	}
}
