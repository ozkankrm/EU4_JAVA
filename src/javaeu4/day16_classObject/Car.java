package javaeu4.day16_classObject;

public class Car {
	
//	properties
	String make;
	String model;
	int currentSpeed;
	String color;
	
//	method
	public void printCarInfo() {
		
		String info = "Car make[" +make+ "], model[" + model + "], color[" + color+
				"], current speed[" +currentSpeed + "]";
		
		System.out.println(info);  
		
	}
	
	public void showCurrentSpeed(int speedLimit) {//speedLimit e methood ad�n� �a��rd���m�zda orda atama yap�l�yorr
		if(currentSpeed<=speedLimit) {
			System.out.println(make + " is driving at " + currentSpeed+ " mph, "
					+ "following the speed limit-" + speedLimit);
		}else {
			System.out.println(make + " is driving at " + currentSpeed+ 
					" mph, following the speed limit-" + speedLimit);
		}
	}
	
	
	public void drive() {
		
		System.out.println(make + " " + model+ " is driving...");
	}
	
	public void accelerate(int mph) {
		
		currentSpeed = currentSpeed + mph;
	}
	
	
}
