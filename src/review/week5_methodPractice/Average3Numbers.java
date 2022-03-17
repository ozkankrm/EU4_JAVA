package review.week5_methodPractice;

public class Average3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getAverage(12.99, 10.4, 9.01);
		getAverage(12.99, 5.4, 9.01);
		getAverage(12.1, 45.99, 19.4);
		getAverage(10, 20, 30);
		
		biggerNumber((short)10, (short)20); // short oldu�unu belirtmek i�in casting 
		
//		second way
		short s1 = 10;
		short s2 = 10;
		biggerNumber(s1, s2);
	}
//	print average of 3 numbers
	public static void getAverage(double num1, double num2, double num3) {
		
		double average = (num1+num2+num3)/3;
		
		System.out.println("The result is " + average);
	}
	
//	print bigger number between 2 short numbers
	public static void biggerNumber(short num1, short num2) {
		
		if(num1>num2) {
			System.out.println("num1 is bigger ");
		}else if(num2>num1) {
			System.out.println("num2 is bigger");
		}else {
			System.out.println("equal");
		}
	}

}
