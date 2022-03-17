package javaeu4.day11_controlFlowStatementPart5_ForLoop;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number = 0;
		
		while(number<=5) {
			System.out.println("Hello");
			++number;
		}
		
		System.out.println("*****************************");
		int i=0;
		while(i<=10) {
			System.out.println("12345");
			i++;
		}
		
//		using a lopp iterate untill we have 10 students in the room
		
		int numberOfStudent = 1;
		
		while(numberOfStudent <= 10 ) {
			System.out.println("Student " + numberOfStudent);
			
			numberOfStudent++;
		}
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
//		print 11, 10, 9, 8.......1
		int j = 11;
		
		while ( j >=1) {
			System.out.print(j+ " ");
			j--;
		}
		
	}

}
