package assignments.day12_Assignment_6_NestedForLoop;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			}
		for(int i=1;i<=6; i++) {
			for(int k=1; k<=7-i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
	}

}
