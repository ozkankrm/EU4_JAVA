package review.week2_OperatorCondition;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int score = 100;
		//increase by 1
		//score +=1;
		
		//
		++score ;
		System.out.println(score);
		
		--score; // decrease by 1
		System.out.println(score);
		
		// pre in/dec will update the value right away and return the update result
		// post in/dec will update teh value and return the update result next time the variable show up
		
		System.out.println("score++ value now is " + score++);
		System.out.println("next time is here " + score);
		
		System.out.println("++score value now is " + ++score);
		
		System.out.println("*************************************");
		
		int appleCount = 8;
		System.out.println("appleCount-- is : " + appleCount--);
		System.out.println("next time is here " + appleCount);
		System.out.println("--appleCount is : " + --appleCount);
		
		//current count 6
		appleCount = appleCount--; // 6 appleCount ta atama yap�lm��
		
		//current count 6
	//	appleCount = --appleCount; // 5 applecount ta atanm��
		
		System.out.println(appleCount);
		
		score = score-- + 2;
		
		System.out.println(score);
		
		
	}
}
