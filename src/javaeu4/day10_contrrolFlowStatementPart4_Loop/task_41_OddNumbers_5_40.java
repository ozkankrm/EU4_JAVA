package javaeu4.day10_contrrolFlowStatementPart4_Loop;

public class task_41_OddNumbers_5_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that displays all odd numbers between 5-140 in same line
		
		for( int i = 5; i<=140; i +=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for ( int i = 5; i<=140; i++) {
			if(i%2==1) {
				System.out.print(i+ " " );
			}
		}
	}

}
