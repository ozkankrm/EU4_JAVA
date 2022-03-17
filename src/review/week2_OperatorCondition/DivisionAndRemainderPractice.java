package review.week2_OperatorCondition;

public class DivisionAndRemainderPractice {

	public static void main(String[] args) {
	
		// 1 minutes 60 seconds
		// 1 hour 60 seconds
		// 1 hour 3600 seconds
		
		// convert the seconds to minutes
	
		int seconds = 11191;
		int minutes, hours ;
		
		minutes = seconds / 60 ;
		System.out.println("The minutes is : " + minutes       );
		
		// how many seconds remaining after getting minutes part
		
		int remainingSecondsAfterMinute = seconds % 60;
		System.out.println("The remaining seconds after minute is : " + remainingSecondsAfterMinute);
	
		// we can use minutes as below
		hours = minutes /60;
		
		// we can use seconds aas below
		hours = seconds / 3600;
		
		System.out.println("Hours is : " + hours);
		
		// Task : convert the seconds to real life example of
		// 3910 seconds is 1 hour 5 minutes and 10 seconds
		
	
	}
	

}
