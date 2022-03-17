package assignments.Assignment_14_OOP;

public class Question_2 {

	public static void main(String[] args) {
		
		LameCalculator lc = new LameCalculator();

		lc.plus(1,1);
		
		lc.minus(1,1);

		lc.multiply(2,1);
		
		lc.divide(10,2);
		
	}

}

class LameCalculator{
	
	public int plus(int num1, int num2) {
		return num1+num2; 
	}
	public int minus(int num1, int num2) {
		return num1-num2; 
	}
	public int multiply(int num1, int num2) {
		return num1*num2; 
	}
	public int divide(int num1, int num2) {
		return num1/num2; 
	}
}
