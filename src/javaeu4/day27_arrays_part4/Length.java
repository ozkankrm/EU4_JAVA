package javaeu4.day27_arrays_part4;

public class Length {

	public static void main(String[] args) {
		
		int[][] numbers = {
				{1,2,3,4},              // row-0
				{5,6},					// row-1
				{9,10,11,23,30,50,60}   // row-2
		};

		//display the numbers of row
		// arraynames.length
		System.out.println(numbers.length);// size of array
		
		// for ile her bir row un lengthini hesaplama
		for(int i=0; i<numbers.length; i++) {
			System.out.println("The number of columnn in row " + i + " is " +  numbers[i].length);
			
		}
		System.out.println("-------------------------------------------");
	//	2d yazd�rmak i�in nested for loop kullan�l�r
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				
				System.out.println(numbers[i][j]);//row-column
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(numbers[0].length);// size of first row
//		
//		System.out.println(numbers[1].length); // size of second row
//		
//		System.out.println(numbers[2].length); // size of third row
		
		
		
		
		
	}

}
