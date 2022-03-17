package javaeu4.day38_inheritance_part2;

public class Car extends Vehicle{
	
	int maxSpeed = 180;
	
	public void display() {
												//super ile parent classtan ald�
		System.out.println("Maximum speed: " + super.maxSpeed);
		System.out.println("Maximum speed: " + maxSpeed);
	}
}


