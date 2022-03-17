package javaeu4.day25_arrays_part2;

public class ReturnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double[] values;
		
		values = getArray();
		
		for(double num : values) {
			
			System.out.print(num + " ");
		}
	}
	public static double[] getArray() {
		
		double[] array = {1.2, 2.3, 3.4, 4.5, 5.6};
		
		return array;
	}

}
