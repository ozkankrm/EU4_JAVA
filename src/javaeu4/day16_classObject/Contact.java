package javaeu4.day16_classObject;

public class Contact {
/*
	�Write a Contact class
	
	Contact // class name
	
	name // properties
	phoneNumber
	email
	
	call() // method
	sendMessage()
	sendEmail()
	*/
	
	String name;
	String phoneNumber;
	String email;
	
	
	public void call() {
		
		System.out.println("Calling " +name + " .........");
	}
	public void sendMessage() {
		
		System.out.println("Sending message to " + phoneNumber + " | name: " + name);
	}
	public void sendEmail() {
	
		System.out.println("Sending email to : " + email+ " ......." );
}
}
