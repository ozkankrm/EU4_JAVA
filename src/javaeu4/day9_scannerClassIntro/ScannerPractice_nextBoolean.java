package javaeu4.day9_scannerClassIntro;

import java.util.Scanner;

public class ScannerPractice_nextBoolean {

	public static void main(String[] args) {
//		crearing scaaner object
		Scanner input = new Scanner(System.in);
		
//		asking user are you recording
		System.out.println("Are you recording?");
		boolean recording = input.nextBoolean(); // boolean uer true veya false girer. �b�rlerini tan�maz
		
//		The result of concatenating a string to any data type  -->string
		System.out.println("We are recording " + recording);
      
//		create an interactive program
	}

}
