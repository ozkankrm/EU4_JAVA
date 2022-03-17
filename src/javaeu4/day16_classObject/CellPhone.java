package javaeu4.day16_classObject;

public class CellPhone {

	/*
	�Write a CellPhone class
	CellPhone-->className
	
	brand // properties=field
	screenSize
	color
	price
	
	call() // methods
	message()
	takeAphoto()
	*/
	
//	properties
	String brand;
	double screensize;
	String color;
	double price;
	
//	method
	public void call() {
		
		System.out.println("Calling....");
	}
	public void message() {
		System.out.println("Sending text message....");
		
	}
	public void takeAphoto() {
		System.out.println("Taking a photo");
	}

}
