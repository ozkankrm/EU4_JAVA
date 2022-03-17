package review.week5_methodPractice;

public class MethodCallDifferentClass {

	public static void main(String[] args) {
//		how do � use the static methods � created in other class
		
		System.out.println("Program starting");
		
//		you can call static methods you created using
//		ClassName.methodNames ( pass arguments if needed

		MethodPractice.sayHello();
		
		MethodPractice.sayHelloWithFullName("Ahmet", "Mehmet");
		
		MethodPractice.sayHelloTo("Tomy");
		
		System.out.println("Program ending");

		
	}
	
	

}
