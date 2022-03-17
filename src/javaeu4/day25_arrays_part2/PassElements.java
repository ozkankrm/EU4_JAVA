package javaeu4.day25_arrays_part2;

public class PassElements {

	public static void main(String[] args) {


		int[] numbers = {5,10,15,20,25,30,50};
		
		for(int values : numbers) {
			
			showValue(values);
		}

	}

	public static void showValue(int n) {
		
		System.out.print(n + " ");
		
	}

}
