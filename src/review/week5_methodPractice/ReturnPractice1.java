package review.week5_methodPractice;

public class ReturnPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int offerCount = 0;
		
		if(offerCount<=0) {
			System.out.println("Keep trying  you will get it");
			return; // break g�revi g�rd�
		}
		
		System.out.println("congrat");
		System.out.println("your offer count is " + offerCount);
		
	}

}
