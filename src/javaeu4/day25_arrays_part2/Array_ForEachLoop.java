package javaeu4.day25_arrays_part2;

public class Array_ForEachLoop {

	public static void main(String[] args) {
		
		int[] numbers = {3,6,9};
		
		for(int val : numbers) {
			
			System.out.println(val);
		}
		
		System.out.println("*********************************************");
		
		String[] products = {"Timberland", "Shirt", "Watch", "Bag", "Shoes"};
		double[] prices = {120.0, 12.99, 300, 25, 67.89};

		for(String prod : products) {
			System.out.println(prod);
		}
		
		System.out.println("***********************************");
//		print products in revers order
		for(int i=products.length-1; i>0; i--) {
			System.out.println(products[i]);
		}
			
			
			
			
			
		System.out.println("****************************************");
		
		for(double pr : prices) {
			System.out.println(pr);
		}
	}

}
