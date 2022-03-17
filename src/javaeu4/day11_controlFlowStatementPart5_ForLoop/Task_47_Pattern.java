package javaeu4.day11_controlFlowStatementPart5_ForLoop;

public class Task_47_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program to create pattern
	
	for(int i = 1; i<=7; i++) {
		for(int j = 1; j<=6; j++) {
			System.out.print("*");
		}
	
		System.out.println();
	}
	
	System.out.println("llllllllllllllllllllllllllllllllllllllll");
	int rows = 6;
	int columns = 6;
	
	for ( int p = 1; p<=rows; p++) {
		for(int k = 1; k<=columns; k++) {
			System.out.print("*");
		}
		System.out.println();	
	}
	}

}
