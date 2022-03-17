package review.week2_OperatorCondition;

public class RelationalOperators {

	public static void main(String[] args) {
		// <,<= , >, >=, 
		// ==, !=
		// it will return a boolean result
		
		int count = 12;
		// = assignment , it is a command
		// == comparison, it is a question --> true or false
		
		// check if the count i
		System.out.println(   count==10  );
		System.out.println(   count!=10  );
		
		// if the count is 10 print, GREAT!!
		// if not print NOT SO GREART!!
		
		//inside parenthesis of if statement, 
		// we can use below
		// -- boolean literals : true, false
		// --bolean variable: assuming you have boolean b = true; --> if(b==true){}
		// --booelan expression: anything that generate boolean result
		if(count ==10) {
			System.out.println("GREAT!!");
		}else {
			System.out.println("NOT SO GREAT!!");
		}
		
		//if the count is odd number , print its odd !!
		// else print even!!
		//count%2==1 //odd

		System.out.println("is count odd " + (count%2==1));
		System.out.println("is count even " + (count%2==0));
		
		if(count%2==1) {
			System.out.println("count is: " + count+ " count is odd");
		}else {
			System.out.println("number is even");
	
		}
		// check if the number can be divided by 3 with o remainder
		// if so print, can be divided by 3
		// try use != this time
		
		if(count % 3 != 0) {
			System.out.println("IT CAN NOT BE D�V�DED BY 3 W�THOUT REMAINDER");
			
		}else {
			System.out.println("IT CAN BE D�V�DED BY 3 WITHOUT REMAINDER");
		}
	}
	

}
