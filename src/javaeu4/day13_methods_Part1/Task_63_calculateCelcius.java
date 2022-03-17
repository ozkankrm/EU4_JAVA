package javaeu4.day13_methods_Part1;

public class Task_63_calculateCelcius {

	public static void main(String[] args) {

//		Write a function that accepts Fahrenheit and displays the Celcius in the console.
//		Sample Output:
//		calculateCelcius(32) -- > 0
//		calculateCelcius(50) --> 10
		
		
		calculateCelcius(32);
	}
// (0�C � 9/5) + 32 = 32�F	
	
	public static void calculateCelcius(int fah) {
		
		int celcius = (fah-32)*5/9;
		System.out.println(celcius);
		
		
	}

	
}
