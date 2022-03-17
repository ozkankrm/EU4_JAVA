package javaeu4.day10_contrrolFlowStatementPart4_Loop;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for ( int count = 1; count <= 5; count++) {
			
			System.out.println("coun = " + count);
		}
		for ( int i = 0; i<=10; i++ ) {
			System.out.println(i);
		}
		
		for (int i = 0; i<5; i++) {
			System.out.println("Hello");
		}
		
//		i    condition   action        increment(i++) //post-increment oldu�u i�in �nce s�f�r� i�leme sokar sonraki i�lemde art�r�r.
//		0      T         print hello    1
//		       T         print hello    2
//		       T         print hello    3
//		       T         print hello    4
//		       T         print hello    5
//		       False
		
		for ( int i = 5; i<=10; i++) {
			System.out.println("i = " + i);
		}
		
		
		for (int num = 20; num>=10; num--) {
			System.out.println("num = " +num);
		}
		for(int i = 0; i<=100; i +=10) {
			System.out.println("i = " + i);
		}
		
		for ( int i = 50; i>=0; i-= 5) {
			System.out.println("i= " + i);
		}
	}

}
