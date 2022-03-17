package review.week5_methodPractice;

public class MethodPractice {

	public static void main(String[] args) {
		
		// Method: reusable block of code with a name
		// optionally with parameters and return type

		
		sayHello();
		sayHello();
		
		sayHelloTo("Ali");
		
		sayHelloWithFullName("Sinan", "Y�ld�z");
	}
	
	public static void sayHello() { // no parameter
		
		System.out.println("Hello from Cybertek");
		System.out.println("Welcome to Ceybertek");
	}
	
	public static void sayHelloTo(String name) { // parameter
		System.out.println("Saying hello to " + name);
	}

	//birden fazla parameter atayabiliriz araya comma koyarak
	// method parameters only can be used inside method
	//local parameter
	public static void sayHelloWithFullName(String name, String lastName) {
		System.out.println("Hello my friend " + name + " " + lastName);
	}
}
