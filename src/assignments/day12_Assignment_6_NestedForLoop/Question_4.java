package assignments.day12_Assignment_6_NestedForLoop;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1
//		10
//		101
//		1010
//		10101
//		101010
//		1010101

		for(int i=1; i<=7; i++) {
			
			int k = 1;
			System.out.print(k);
			
			for(int j=1; j<=i-1; j++) {
				int m=0;
				System.out.print(m);
				System.out.print(k);
			}
		
			System.out.println();
		}

}
}
