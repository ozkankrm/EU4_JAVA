package review.week2_OperatorCondition;

public class OperatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Naming Convention
		 * Class name :
		 *  Always with first letterr upper case
		 *  and if you have more word, user uppercase for second word
		 *  for example : MyAwesomeClassNameHere
		 *  
		 * Package name: 
		 *  always lower case, you may add _ to different words
		 *  
		 * Variable name 
		 * 	always start with lower case, if you have more words : camelCase
		 * 
		 *Generally give meangful names for readability
		 * 
		 */
		
		int myNumber = 10; // genelde bu y�ntemi kullan
		
		int myNumber2 = 100;
		
		// increase the value of myNumber2 by adding myNumber
					// 100    + 10
		myNumber2 = myNumber2 + myNumber ; // 110
		System.out.println(myNumber2);
		
		
		// unary operators +,-,!
		
		int num3 = -15 ;
		int num4 = 15;
		
		// change the value of num4 to minus num3 if it was plus or minus if it was minus
	
		num4 = -num3;
		System.out.println("current value of num4 is : " + num4);
		
		// ! usedd to flip the value of boolean
		boolean lightOn = true;
		
		System.out.println( lightOn);
		System.out.println(!lightOn);
		
		//+=, -=, *=, /=, %=
		
		int score = 100;
		// increase by 10
		score += 10; // score = score + 10;
		System.out.println("score is "+score);
		
		// decrease by 100
		score -= 100; // score = score-100
		System.out.println("score is " + score);
		
		// multiply existing score by 3
		score *= 3; // score  = score*3
		System.out.println("score is " + score);
		
		// divide by 2
		score /= 2;  // score = score/2
		System.out.println("score is " + score);
		
		// remaining by 6
		score %=6; // score = score % 6;
		System.out.println("score is " + score);
		
	}

}
