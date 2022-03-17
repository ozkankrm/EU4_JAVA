package javaeu4.day39_inheritance_review_access_modifiers;

public class Car extends Vehicle {
	
	/*public Car() {// compiler create no arguments constructor and super()
		super();
	}
	*/
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	
	
	//string name ve string size aşağıdaki metoda koyduk ama bu classta yok. BUnlar vehicle (parent) classtan kullandık
	public Car(String name, int size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	public void changeGear(int currentGear) {
		this.currentGear=currentGear;
	}
	
	public void changeVelocity(int speed,int direction) {
		System.out.println("Car.changeVeloctiy():Veloctiy " + speed + " direction " + direction);
		super.move(speed,direction);
	}
	
	@Override
	public void move(int velocity, int direction) {
		setCurrentVelocity(velocity+10);
		setCurrentDriection(direction + 10);
		System.out.println("Vehicle.move(): Moving at " + getCurrentVelocity() + " in direction " + getCurrentDriection() );
	}

	

}
