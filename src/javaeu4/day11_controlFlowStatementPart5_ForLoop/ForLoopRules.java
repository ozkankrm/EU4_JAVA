package javaeu4.day11_controlFlowStatementPart5_ForLoop;

public class ForLoopRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1 - Creating an infinite loop
//		components of the for loop are each optional
		
//		for ( ; ; ) { // s�n�rs�ns say�da hello yazd�r�r
//			System.out.println("Hello"); 
//		}
//		
//		int i = 1;
//		for(; i<=5; i++) {
//			System.out.println("Hello");
//		}
//		
//		for ( ; ; i++) {
//			System.out.println("Hello");
//		}
//		
////		for ( ; x<=5; i++) { // condition always true and s�n�rs�z devam eder.
//			System.out.println("Hello");
//		}
//		int x = 0;
		
//		for (long y=0,z=4; x<5 && y<10; x++, y++) {
//			System.out.print(y + " "); // 0 1 2 3 4 
//		}
//		System.out.println(x); // 5
		
		// result 0 1 2 3 4 5 
		
//		3- Redaclaring a variable in the int block
		
//		int x = 0;
//		for( long y = 0, x = 4; x<5 && y<10; x++, y++) {  // does not compiler
//			System.out.println("Hello");
//		}
		
//		int x = 0;  // burda x e atama yapm���z
//		int y = 0; // burda y ye atama yapm���z
//		
//		for( y =1, x = 4; x<5 && y<10; x++, y++) {   // yukarda x ve y ye yeniden atama yapm���z ve bu �al���r
//			System.out.println("Hello");
//		}
		
		
//		4- Using incompatible data types in the init bloc
//		the variables in the init block must all be of the same data type
		
//		for ( long y=0; int x=0; x<5 && y<10; x++, y++) { // does not work. in for not same data type
//			System.out.println("Hello");
//		
//		}
		
//		5 - using loop variables outside the loop
//		for( long y = 0, x = 4; x<5 && y<10; x++, y++) {  
//			System.out.println("Hello");
//	}
//		System.out.println(x); // does not compiler
}

}