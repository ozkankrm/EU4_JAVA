package assignments.day12_Assignment_6_NestedForLoop;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=7; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}for(int k=i; k<=7; k++) {
				System.out.print(k + " ");
			}
			System.out.println(" ");
		}
		for(int i=6; i>=1; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}for(int k=i; k<=7; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
