package javaeu4.day12_controlFlowStatementPart6_branchinStatement;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
for(int i = 1; i<=5; i++) {
			
			if(i==4) {
				break;
			}
			System.out.println(i);
		}

for(int i = 1; i<=5; i++) {
	
	if(i==4) {
		continue;
	}
	System.out.println(i);
}
		
	}

}
