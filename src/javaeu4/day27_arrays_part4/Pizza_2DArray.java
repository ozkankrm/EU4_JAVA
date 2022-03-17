package javaeu4.day27_arrays_part4;

import java.util.Arrays;

public class Pizza_2DArray {

	public static void main(String[] args) {
	
		String[][] pizzas = {
				
				{"pinneapple", "pepperoni"},
				{"anchovie", "mushrom", "olives"},
				{"4 cheese"},
				{"chicken", "tomatoes", "onions"},
				{"green peppers", "zuccini", "brocoli", "spinach","shrimp"}
		};

		System.out.println(Arrays.toString(pizzas[0]));
		
		System.out.println("###FOR EACH LOOP##");
		// her bir row u yazd�rmak i�in foreachloop kulland�k
		for(String[] piz : pizzas) {
			
			System.out.print(piz.length + "-");
			System.out.println(Arrays.toString(piz));
		}
		
		System.out.println("###FOR LOOP##");
		//her row u yazd�rd�k
		for(int i=0; i<pizzas.length; i++) {
			System.out.print(pizzas[i].length);
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		// istenilen bir row un i�ini yazd�rmak i�in foreach loop kulland�k
		for(String value : pizzas[3]) {
			System.out.println(value);
		}
		
		
		System.out.println("--------------------------------------");
		
		for(int row=0; row<pizzas.length; row++) {
			for(int column=0; column<pizzas[row].length; column++) {
				System.out.println(pizzas[row][column]);
			}
		}
	}

}
