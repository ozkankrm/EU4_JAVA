package javaeu4.day10_contrrolFlowStatementPart4_Loop;

public class TernaryOperator {

	public static void main(String[] args) {


		String result;
		int score = 88;
		
		if(score>60) {
			result = "pass";
		}else {
			result = "fail";
		}

		result = (score>60) ? "pas": "fail";
		System.out.println(result);
		
		int a= 5;
		System.out.println(a>2 ? a<4 ? 10 : 8 : 7); // nested ternary
	}

}
