package javaeu4.day14_valueReturn;

public class Task_66_calculateTravelled {

	public static void main(String[] args) {
		
//		The distance a vehicle travels can be calculated as follows:
//			Distance = Speed * Time
//			Write a method named distance that accepts a vehicle�s speed and time as arguments,
//			and return the distance the vehicle has traveled.

		double totalDistance = distance(50, 2);
		
		System.out.println(totalDistance); // bu �ekilde de yazd�r�labilir
		System.out.println(distance(10, 5)); // bu �ekilde de yazd�r�labilir
		
		
//		buraya if, loop switch vb i�lemler yapabilirsin
		
	}

	public static double distance(double speed, double time) {
		
		double distanceTraveled;
		distanceTraveled = speed*time;
		
		return distanceTraveled; // return ayr�ca breaking g�revi g�r�r ve burdan sonra bir�ey yazd���nda hata verir
		
//		System.out.println(); //bu hata verir
		
	}
}
