package javaeu4.day11_controlFlowStatementPart5_ForLoop;

public class Task_48_Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		for(int i = 1; i<=7; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print("");
//				
//			}for( int k = 1; k<=i; k++) {
//				System.out.print("*");
//			}
//		
//			System.out.println();
//		}
		
		int rows = 7;
		
		
		for ( int i = 1; i<=rows; i++) {
			for(int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}
