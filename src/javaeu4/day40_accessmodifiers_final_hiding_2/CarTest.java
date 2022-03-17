package javaeu4.day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class CarTest {

	public static void main(String[] args) {

		// başka classı kullanmadan önce o classı import etmek gerekiyor
		//yukarda day40 classını import yaptık ve error gone
		
		Car c = new Car();

		
//		c.model = "M3"; // default olduğu için başka packageden ulaşamyız
		c.year = 2017;
//		c.door = 4;// private can not access outside class
//		c.engine = 1.6;//protected accessible within same package or sub class different package
		
		

	}

}
