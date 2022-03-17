package javaeu4.day24_arrays_Part1;

public class EachElementArray {

	public static void main(String[] args) {
		
		
		String[] myArray= { "orange", "apple", "watermelon", "banana"};
		
		for(int i=0; i<myArray.length; i++) {
			
			System.out.println(myArray[i]);
			
		}
		
		
		int[] scores = {80,90,100,35,60,72,64,30,10,5,3,99,89};
//		average
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			
			sum += scores[i];	
		}
		
		System.out.println("sum is: " + sum);
		System.out.println("Total element in array is: " + scores.length);
		
		int average = sum/scores.length;
		
		System.out.println("Average is: " + average);
	
	}
}
