package javaeu4.day10_contrrolFlowStatementPart4_Loop;

public class task_42_EvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that displays sum of even and odd numbers between 1 and 100
//		excluding 100
		
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 1; i<100; i++) {
			
			if(i%2==0) {	
				sumEven = sumEven +i;	 
			}else {
				sumOdd =sumOdd + i;		
			}
			}
		System.out.println("Sum of even number " + sumEven);
		System.out.println("Sum of odd number " + sumOdd);
		System.out.println(sumEven+sumOdd);
		}
	}


