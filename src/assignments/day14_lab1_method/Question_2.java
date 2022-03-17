package assignments.day14_lab1_method;

public class Question_2 {

	public static void main(String[] args) {
		
//		The number 6 is a truly great number. Write a method that accepts num1 and num2, 
//		prints true if either one is 6. Or if their sum or difference is 6.
//
//		love6(6, 4) --> true
//		love6(4, 5) --> false
//		love6(1, 5) --> true
//		love6(12, 6); -->true
		
		trulyGreatNumber(6,4);
		trulyGreatNumber(4,5);
		trulyGreatNumber(1,5);
		trulyGreatNumber(12,6);

	}
//     first --> num1 or num2 is 6
//	 second -->num1 plus num2 or num2 plus num1 is 6
//	third---> num1 minus num2 or num2 minus num1 6
	public static void trulyGreatNumber(int num1, int num2) {
		
		boolean truly = true;
		if(num1==6 || num2==6) {
			truly = true;
			
		}else if(num1+num2==6) {
			truly = true;
			
		}else if(num1-num2==6 || num2-num1==6) {
			truly = true;
		}else {
			truly = false;
		}
		System.out.println(truly);
		
//		second way
		
//		if(num1==6 || num2==6 || num1+num2==6 || num1-num2 || num2-num1) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
	}

}
