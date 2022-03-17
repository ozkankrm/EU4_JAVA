package javaeu4.day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class Car2 extends Car{
	
	public Car2() {
		super();
		
//		model = "M3";//default cannnot access different package
		year = 2017;//public
//		door = 4;//private cannot access outside class
		engine = 1.6;//protected can access sub class in different package
		
		
	}

	

}
