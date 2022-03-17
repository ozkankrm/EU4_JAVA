package javaeu4.day11_controlFlowStatementPart5_ForLoop;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for ( int i = 1; i<=5; i++) {
			System.out.println("Outer Loop Iteration " + i);
			for(int j = 1; j<=2; j++ ) {
				System.out.println("i= " + i+ "; j= " +j);
			}
		}
	}

}
