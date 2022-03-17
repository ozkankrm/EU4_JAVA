package javaeu4.day10_contrrolFlowStatementPart4_Loop;

public class task_40_EvenNumber_1_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program that displays all even numbers between 1-100 in same line
		
		for ( int i = 0; i<=100; i+=2) {
			System.out.print(i + " ");
			
			
		}
		System.out.println();
		for (int i = 0; i<=100; i++) {
			
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}

}
