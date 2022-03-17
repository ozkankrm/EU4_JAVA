package javaeu4.day12_controlFlowStatementPart6_branchinStatement;

public class LabeledStatement_Task_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		outer:
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--);
						if(i==4) {
							break outer;
						}
					}
			}while(true);
	}

}
