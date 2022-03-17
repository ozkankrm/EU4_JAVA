package review.week5_methodPractice;

public class MethodWithReturnType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum();
		int x = sum();
		System.out.println(x);
		
		sum1(100);
		int y = sum1(100);
		System.out.println(y);
		
		System.out.println(sum1(50));
		System.out.println("sum from 1 to 100: " +y);
		
		int result = sum1(-1);
		System.out.println("sum from 1 to -1 : " + result);
		
		
	}
//	create a method that get sum of number from 1 to 100
//	accept no parameter and return sum
	
	public static int sum() {
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum = i+sum;
		}
	return sum;
		
	}
	
//	create a method that get sum of number from 1 to ANY
//	bu da ka� girilirse onun toplam�n� verir
public static int sum1(int a) {
		
		int sum1 = 0;
		
		for(int i=1; i<=a; i++) {
			sum1 = i+sum1;
		}
	return sum1;

}
}
