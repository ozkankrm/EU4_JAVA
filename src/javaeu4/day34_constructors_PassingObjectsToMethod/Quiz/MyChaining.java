package javaeu4.day34_constructors_PassingObjectsToMethod.Quiz;



public class MyChaining {
	
	public MyChaining() {
		System.out.println("In default constructor...");
	}
	public MyChaining(int i) {
		this();
		System.out.println("In single parameter constructor...");
	}
	public MyChaining(int i, int j) {
		this(j);
		System.out.println("In double parameter Constructor...");
	}

}
