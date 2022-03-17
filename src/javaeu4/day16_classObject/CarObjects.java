package javaeu4.day16_classObject;

public class CarObjects {

	public static void main(String[] args) {
		
//		car1 object ol�turduk 
		Car car1 = new Car();
		
		
		car1.printCarInfo();// b�yle yazd�r�dsak default de�erler al�r 
//							�nce objeye de�er vermemiz laz�m

		car1.make = "BMW";
		car1.model = "X3";
		car1.color = "Red";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();//burda yukarda atad���m�z de�erlerle yazd�r�r
		
		car1.showCurrentSpeed(100);
		car1.showCurrentSpeed(50);
		
		car1.drive();
		
		System.out.println("before: " + car1.currentSpeed);
		car1.accelerate(20);// methoddaki form�l� buraya yazd�rd�
		System.out.println("after: " + car1.currentSpeed);
	}

}
