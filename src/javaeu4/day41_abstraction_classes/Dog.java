package javaeu4.day41_abstraction_classes;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating food");
		
	}

	@Override
	public void breathe() {
		System.out.println("Dog is breathing");
		
	}
	
	
	
	

}
