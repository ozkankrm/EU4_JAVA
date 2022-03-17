package javaeu4.day44_oop_practice.callcentre;

public interface VoiceCallable {
	
	boolean CAN_CALL = true;
	
	//abstract method
	void call(String contact);
	
	//static method
	public static void decline() {
		System.out.println("ike decline voice call");
		
	}
	
	//default method // we can override default method
	public default void accept() {
		System.out.println("Mike accept voice call");
		
	}

}
