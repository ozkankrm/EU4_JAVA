package review.week5_methodPractice;

public class ssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		calculate(20, 10,  '+');
		calculate(20, 10,  '-');
		calculate(20, 10,  '*');
		calculate(20, 10,  '/');
		
		
	}
	
	public static void calculate(double num1, double num2, char operator) {
		
		switch(operator) {
		case '+':
			System.out.println("Addition result is " + (num1+num2));
			break;
		case '-':
			System.out.println("Substraction result is " + (num1-num2));
			break;
		case '*':
			System.out.println("Multiplacation result is " + (num1*num2));
			break;
		case '/':
			if(num2!=0) {
			System.out.println("Division result is " + (num1/num2));
			
			}else {
				System.out.println("Divison result is 0");
			}
			break;
		default:
			System.out.println("INVALID OPERATOR");
			break;
		
		}
	}

}
