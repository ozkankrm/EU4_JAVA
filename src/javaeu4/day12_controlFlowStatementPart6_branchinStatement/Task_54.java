package javaeu4.day12_controlFlowStatementPart6_branchinStatement;

public class Task_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 1;
		int sum = 0;
		
		do {
			
			if(start%2==0) {
				continue;
			}
			sum += start;
		
		}while(++start<=10);
		
		System.out.println(sum);
	}

}
