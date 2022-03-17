package javaeu4.day17_ClassObjectsPart2;

public class BMW {

//	String make = //"BMW"; //burda value atamay�z e�er atarsak di�er tarafta make lerin 
//							hepsi atad���m�z de�eri al�r d1=make, d2=make
	String make;
	String model;
	double price;
	
	public void showPrice() {
		
		switch(model) {
		case "330i":
			price = 40250;
			break;
		case "740i":
			price = 85000;
			break;
		case "m3":
			price= 65000;
			break;
		default: 
				System.out.println(model + " is not available");
				break;
		}
		System.out.println("Price: " + price);
	}
			
	
}
