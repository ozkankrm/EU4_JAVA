package javaeu4.day39_inheritance_review_access_modifiers;

public class Toyota_Test {

	public static void main(String[] args) {


		Toyota toyota = new Toyota(36);
		
		toyota.steer(45);
		toyota.accelerate(30);
		toyota.accelerate(20);
		toyota.accelerate(-42);

	}

}
