package review.week2_OperatorCondition;

public class IfStatementGrader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Grading system");
		
		int score = 70;
		
		// more than 70 prin pass
		
	//	if (score>=70){
	//		System.out.println("PASS");
	//	}
		
//		if(score>=70) {
//			System.out.println("PASS");
//		}else {
//			System.out.println("FA�L!!");
//		}
		
		// if the score is more than 100 or less than 0 --> invalid
		// if score
		//
		//100-90 A
		//80-89 B
		//70-79 C
		//anything below, F
		if ( score<0 || score>100) {
			System.out.println("In valid number");
		}else if(score>=90 && score<=100) {
			System.out.println("A");
		}else if(score>=80 && score<90) {
			System.out.println("B");
		}else if(score>=70 && score<80) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		
		
		System.out.println("Thanks come back again soon!");
	}

}
