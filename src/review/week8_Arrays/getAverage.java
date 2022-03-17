package review.week8_Arrays;

public class getAverage {

	public static void main(String[] args) {
		/*
		 *  Create a method that will accept an int array and return the average of the elements
    Ex: [10, 15, 5, 6] -> 9
		 */
		
		int [] x = {1,5,7,8,9};

		System.out.println(getAverage(x));
		
	}
	public static double getAverage(int[] array ) {
		
		double sum = 0;
		for(int value : array) {
			
			sum += value;
		}
	
		return sum/array.length;
	}
// method overloading
public static double getAverage(double[] array ) {
		
		double sum = 0;
		for(double value : array) {
			
			sum += value;
		}
	
		return sum/array.length;
}
}
