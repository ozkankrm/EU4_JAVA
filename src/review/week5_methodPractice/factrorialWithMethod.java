package review.week5_methodPractice;

public class factrorialWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factroial(10);
//		output: 10 9 8 7 6 5 4 3 2 1
	}
	
	public static void factroial(int n) {
		
		if(n==1) {
			return;
		}
		
		System.out.print(n +" ");
		
		factroial(n-1);
	}

}
