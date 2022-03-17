package javaeu4.day34_constructors_PassingObjectsToMethod;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple();

		changeApple(a1);
		
		methodObject().color = "Brown"; // hold whatever we are returning from method
		System.out.println(	methodObject().color);
		
		
	}
	
	public static void changeApple(Apple b1) {// (Apple -->ClassName b1-->reference)
		
		// I want to change the color inside the methodd
		
		b1.color = "Yellow";
		System.out.println(b1.color);
		
		b1.mA(); //object.methodName
	}
	
	// return type object 
	public static Apple methodObject() {
		
		Apple a1 = new Apple();
		
		return a1;
	}

}
