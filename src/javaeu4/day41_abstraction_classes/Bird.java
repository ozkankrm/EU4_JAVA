package javaeu4.day41_abstraction_classes;

public abstract class Bird extends Animal {

	
	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Bird is eating");
		
	}

	@Override
	public void breathe() {
		System.out.println("Bir is breathing");
		
	}
	
	public abstract void fly();
	
	
}
