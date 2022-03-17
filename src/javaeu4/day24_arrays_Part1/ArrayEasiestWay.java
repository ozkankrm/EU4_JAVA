package javaeu4.day24_arrays_Part1;

public class ArrayEasiestWay {

	public static void main(String[] args) {
		
		/*
		 * 
		 */
//		not use new keyword
//		easiest way declare, create and initialize
		int[] myList1 = { 1,5,6,7,10};
		
		String[] myArray = { "Apple", "Orangle", "Bananas", "Watermelon"};
		System.out.println(myArray[2]);// bananas
		
//		<variablename.lengt> arrayin ka� karakkterden olu�ru�unu verir. yani uzunlu�unu
		System.out.println(myArray.length);// 4 
		
		System.out.println(myList1[1]);
		System.out.println(myList1[2]);
		System.out.println(myList1[3]);
		System.out.println(myList1.length);//5
		
		
//		second way -->use new keyword
//		int [] myList = new int[4];
//		myList[0] = 1;
//		myList[1] = 4;
//		myList[2] = 8;
//		myList[3] = 9;
		

	}

}
