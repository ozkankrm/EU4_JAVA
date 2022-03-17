package javaeu4.bootcamp.day1;

public class Constructor {

	public static void main(String[] args) {
		
		new Constructor(1).method1();
		new Constructor(2).method2();
		
		Constructor obj = new Constructor(1);
		obj.method1();
		obj.method2();
		
		
	}
	
	public void method1() {
		System.out.println("Hello");
	}

	public void method2() {
		System.out.println("How are you");
	}
	
	public Constructor(int a) {
		System.out.println("integer " + a);
	}
}
