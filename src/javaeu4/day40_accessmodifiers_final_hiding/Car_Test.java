package javaeu4.day40_accessmodifiers_final_hiding;

public class Car_Test {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.model = "M3";
		c.year = 2017;
//		c.door = 4;// private can not access outside class
		c.engine = 1.6;//protected accessible within same package

		System.out.println(c.toString());// arraydan reference addressi verir eğer override yapmamışsak
										//eğer override yapmışsak objenin değerini verir.	.
		
		
	}

	
	
}
