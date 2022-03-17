package javaeu4.day11_controlFlowStatementPart5_ForLoop.Assesment_3;

public class Question_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 1;
		int sum = 0;
		
		do {
			if(start%2==0) {
				start++;
			}
			sum += start;
		}while(++start<=10);
		System.out.println(sum);
	}

}
