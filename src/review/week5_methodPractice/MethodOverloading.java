package review.week5_methodPractice;

public class MethodOverloading {

	public static void main(String[] args) {
//		same method different parameters
//		method overloading, reusing the name of the method with different parameter list
//		name + parameter list = method signature
//		valid overloading : same name different parameter list(count or data type)
//		ORDER MATTER!!!!
//		The rule for selection:
		//It will always look for exact match first
		//when it can not find exact match, it will look for higher primitive data typr
		

		addNumbers(10);
		addNumbers(10, 40);
		addNumbers(10d, 5d);
		addNumbers(1, 2, 4);
		
		byte b = 10;  // byte oldu�unu berlirtmek laz�m yoksa int kabul eder ve int
		addNumbers(b); // statemen gider ordan yazd�r�r
	}
	
	
	
//	addNumbers that has 2 int parameter;
	//it will add 10 to the numbers provided and print
	public static void addNumbers(int num1, int num2) {
		System.out.println("the result is " + (num1+num2));
	}
	

//	addNumbers that has 1 int parameters:
	//it will add these two numbers and print
	public static void addNumbers(int num) {
		System.out.println("the result is " + (num+10));
	}
	
//	addNumbers that has 2 double parameter;
	//it will add 10 to the numbers provided and print
	public static void addNumbers(double num1, double num2) {
		System.out.println("the result is " + (num1+num2));
	}
	
	
//	addNumbers taht has 3 numbers parameter:
	// it will add these three numbers and print
	public static void addNumbers(int num1, int num2, int num3) {
		System.out.println("the result is " + (num1+num2));
	}
	
	public static void addNumbers(byte num) {
		System.out.println(" byte call with " + num);
	}
}
