package javaeu4.day30_wrapperClass;

import java.util.Arrays;

public class Task_96_ConvertingTemp {

	public static void main(String[] args) {
		/*
		 * String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		 * Write a program to output: 72 degree is equal to 22.22 celcius
		 */

		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		String[] arr = str1.split("and ");//�nce stringe split iki b�ld�k
		arr = arr[1].split(" degree");// sonra 72 yi elemtin ba�� olacak �ekilde b�ld�k
		
		String degree = arr[0];
		
		double degreeF = Double.parseDouble(degree);
		
		//System.out.println(degreeF);
		
		double degreeC = (degreeF-32)*5/9;
		
		System.out.println(degreeF + " degree is equal to " + degreeC + " celcius");
		
		
		//System.out.println(Arrays.toString(arr));
		
	}

}
