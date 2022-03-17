package javaeu4.day26_arrays_part3;

import java.util.Random;

public class MethodArray {

	public static void main(String[] args) {
		//iki  method olu�tur birinde array olu�turikincisinde yazd�r

		
	printArray(5);
	
	}
	
	public static int[] creatArray(int arraySize) {
		
		Random rn = new Random();
		
		int[] myArray = new int[arraySize];
		
		for(int i=0; i<myArray.length; i++) {
			
			myArray[i] = rn.nextInt(100);// her bir elemente assign yapt�k random ile
		}
		
		return myArray; // reference name 
	}
	
	public static void printArray(int number) {
		
		for(int value : creatArray(number)) {// yukar�daki array return oldu�u i�in onu �a��r�p yazd�rd�k
			System.out.println(value);		//  creatArray() yukardaki methodu �a��rma y�ntemi ve 
		}									// ve i�ine (int) int de�er almas� laz�m. oraya number koyduk
											//	creatArray(number)
	}

}
