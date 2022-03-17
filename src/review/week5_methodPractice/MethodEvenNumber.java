package review.week5_methodPractice;

public class MethodEvenNumber {

	public static void main(String[] args) {
		
		countEvenNumberFrom1To50();
		System.out.println();
		countEvenNumberFrom1To50(0);
	}
//	count from 0-50, only even number
	
	public static void countEvenNumberFrom1To50(int a) {
		
		if(a>=50) {
			return;
		}
		System.out.print(a + " ");
		
		countEvenNumberFrom1To50(a+2);
		
		
	}
	
		
//	second way
	public static void countEvenNumberFrom1To50() {
		
		for (int i = 1; i <=50; i++) {
			
			if(i%2==0) {
				System.out.print(i + " ");
			}
			
		}
	}
	
}
