package javaeu4.day41_abstraction_classes;

public class Parrot extends Bird{

	public Parrot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Bird is flying");
		
	}
	
	//what method has access
	//all of them
	
	//eat(), breathe(), fly(), move() - > all of them has implementation now or not?
	
	

}
