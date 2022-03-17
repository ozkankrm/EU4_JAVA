package javaeu4.day11_controlFlowStatementPart5_ForLoop.Assesment_3;

public class Question_22 {

	public static void main(String[] args) {
		
		label1: for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(i+j-1>10) {
					break label1;
				}
			}
			System.out.println("hello"); // 3 times write hello
		}

	}

}
