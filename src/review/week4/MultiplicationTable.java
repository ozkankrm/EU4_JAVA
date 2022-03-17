package review.week4;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Table of number 2");
//		int tableNum = 2;
//		for(int k = 1; k<=10; k++) {
//			System.out.println(tableNum + " X " + k + " = " + (tableNum*k));
//		}
//		System.out.println("**************************************");
		
		for (int i = 1; i <=12; i++) {
			
			System.out.println("Multiplication table for " + i);
			for (int j = 1; j <=10; j++) {
				System.out.println((i + " X " + j + " = " +i*j) + " ");
			}
			System.out.println();
		}
		
		System.out.println("************************************");

		for (int i = 1; i <=12; i++) {
			
			System.out.println("Multiplication table for " + i);
			for (int j = 1; j <=10; j++) {
				System.out.println((i + " X " + j + " = " +i*j) + " ");
			}
			System.out.println();
		}
	}

}
