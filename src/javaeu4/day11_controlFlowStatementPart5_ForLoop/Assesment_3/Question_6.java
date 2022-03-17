package javaeu4.day11_controlFlowStatementPart5_ForLoop.Assesment_3;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 0;
		
		int m = 0;
		
		for(int i=0; i<=3; i++) {
			k++;
			if(i==2) {
				i=4;
			}
			m++;
		}
		System.out.println(m + "," + k);
	}

}
