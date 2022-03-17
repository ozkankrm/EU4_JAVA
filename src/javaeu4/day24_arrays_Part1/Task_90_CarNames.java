package javaeu4.day24_arrays_Part1;

public class Task_90_CarNames {

	public static void main(String[] args) {
		/*
		 * �Create a car array that holds 6 car names inside
�Check if your array has the car name �Honda�
�If it is , print � I found your car Honda in this array�
�If it is not, print � I could not find your car Honda in this array�
		 */

		
		String[] carList = {"Honda", "Nissan", "Toyota", "BMW", "Mercedes"};
		
//	 first way	
		for(int i=0; i<carList.length; i++) {
			
			if(carList[i].equals("Honda")) {
				
				System.out.println("I found your car Honda in this array");
				break; // honday� g�rd�kten sonra kalan� check etmez ve sonland�r�r.
				
			}else {
				System.out.println("I could not found your car Honda in this array");
				
			}
		}
		
//		second way
		boolean flag = false;
		for(int i=0; i<carList.length; i++) {
			
			if(carList[i].equals("Honda")) {
			
				flag=true;
				break;
		
		}
			if(flag) {
				System.out.println("Fount it");
			}else {
				System.out.println("Not found it");
			}
		
		
		
//		third way
		int index = 1;
		
		if(carList[index].equals("Honda")) {
			
			System.out.println("I found your car Honda in this array");
			
		}else {
			System.out.println("I could not found your car Honda in this array");
			
		}
		
		
		
		
		
	}

	}
}
