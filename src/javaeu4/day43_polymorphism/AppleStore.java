package javaeu4.day43_polymorphism;

public class AppleStore {

	public static void main(String[] args) {
		
		AppleDevice mac = new Mac(); //polymorphism
		mac.use();//go to AppleDevice class if method override go child class and run override method from child class
				 // if method not override run method from parent class
		//mac.code();//give error because code() method not exist in parent class and parent class decide access
		
		Mac myMac = new Mac();//not polymorphism
		myMac.use();
		myMac.code();
		
		AppleDevice watch = new AppleWatch();
		watch.use();
		
		
	}

}
