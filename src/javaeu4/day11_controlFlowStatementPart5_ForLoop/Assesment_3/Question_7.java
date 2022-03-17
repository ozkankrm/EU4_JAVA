package javaeu4.day11_controlFlowStatementPart5_ForLoop.Assesment_3;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i =0, j=0; sum>20; ++i, --j) {
			sum = sum+i+j;
		}
		System.out.println("Sum = " + sum);
	}

}
