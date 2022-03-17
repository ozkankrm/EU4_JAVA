package javaeu4.day10_contrrolFlowStatementPart4_Loop;

public class Task_45_LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		User should be able to declare 2 values and program should display which number is
//		largest.
//		if numbers are equal, it should display numbers are equal
//		Above steps need to repeated to number of times that is also declared by user.
	
		int a= 10;
		int b = 15;
		int largest;
		for ( int i = 1; i<3; i++) {
			if(a>b) {
				System.out.println("a greater than b");
			}else if(b>a) {
				System.out.println("b is greater than a");
				
			}else if(a==b) {
				System.out.println("a is equal to b");
			}
		
		}
		
	
	}

}
