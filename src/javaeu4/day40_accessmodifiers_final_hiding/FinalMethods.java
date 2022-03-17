package javaeu4.day40_accessmodifiers_final_hiding;

public class FinalMethods {
	public final void method1() {//burda final kullanınca sub classta override yapamayız
		System.out.println("Method-1");
	}
	
	public static final void staticMethod(String word) {
		System.out.println("Static Method");
	}

}

class Sub extends FinalMethods{
	
	/*
	@Override
	public void method1() {
		System.out.println("Method-1 in sub class");
	}

	

	public static void staticMethod(String word) {
		System.out.println("Static method in sub class");
	}

	 */

}
