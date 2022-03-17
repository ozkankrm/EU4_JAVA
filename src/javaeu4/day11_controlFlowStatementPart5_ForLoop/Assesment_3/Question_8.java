package javaeu4.day11_controlFlowStatementPart5_ForLoop.Assesment_3;

public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for(int i =0; i<10; i++) {
			if(i%3==0) {
				sum = sum+i;
			}
		}
		System.out.println("Sum = " + sum);
		
	}

}
