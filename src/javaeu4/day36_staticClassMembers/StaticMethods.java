package javaeu4.day36_staticClassMembers;

public class StaticMethods {
	
	static String name = "Apple";
	int age = 10;
	
	public static void show1() {
//		show2();// u cannot call instance method/variable from static methods
		show4();// you can call static method from static method
	
//		you cannot call in stance variable from static method
//	System.out.println(age);
		System.out.println(name);// you can call static from static methods
	}
	public void show2() {
	show1();
	System.out.println(age);
	}
	public void show3() {
	show2();
	show1();
}
	public static void show4() {
	
}


}
