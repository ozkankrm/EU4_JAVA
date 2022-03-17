package javaeu4.day26_arrays_part3;

import java.util.Scanner;

public class MethodArrays2 {

	public static void main(String[] args) {
		
		System.out.println(findCar(4, "honda"));

	}

//	creatArray- will accept one parameter which is carSize
//	user will enter some cars
	
	public static String[] createArray(int arraySize) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] carArray = new String[arraySize];
		
		for(int i=0; i<carArray.length; i++) {
			
			System.out.println("Enter your car #" + (i+1) );
			carArray[i] = scn.next();
		}
		return carArray;
	}
	
//	findcar method-will accept 2 parameters which 1-int value, toFindCar
//	if car is found -return true
//	if no found return false
	
	public static boolean findCar(int value, String toFindCar) {
		
		for( String car : createArray(value)) {
			
			if(car.equalsIgnoreCase(toFindCar)) {
				return true;
			}
		}
		return false;
	}
}
