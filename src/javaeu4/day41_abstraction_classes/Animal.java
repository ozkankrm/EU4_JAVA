package javaeu4.day41_abstraction_classes;

public abstract class Animal {
	
	String name;
//	abstract int x;// ERROR
	
	//constructor
	public Animal(String name) {
		this.name = name;
	}
	
	{
		//block
	}
	
static	{

	//static block
	}

	//static method
	public static void method1() {
		
	}
	
//	public abstract final void method2();//give error--> you dont use final keyword, because we will override, if final we cannot override 

	//abstract method
	public abstract void eat(); // abstract method does not have body(no curly braces) 

	public abstract void breathe();
	
	public void move() {//instance method
		System.out.println("Moving");
	}
	
	
}
