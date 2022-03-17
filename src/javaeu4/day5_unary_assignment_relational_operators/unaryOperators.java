package javaeu4.day5_unary_assignment_relational_operators;

public class unaryOperators {

	public static void main(String[] args) {
		//  +, -, ++, --, !
		boolean flag = true;
		System.out.println(!flag); //false
		System.out.println(!!flag); //true
		
		int i =10, j=5;
		i++; // same as i = i + 1
		--j; // same as j = j - 1
		
		System.out.println("i = " +i); // 11
		System.out.println("j = " + j); //4
		
		//i=11, j=4
		int res = i++ + --j;
		System.out.println("res = " + res); // 14
		
		//res= 11+3
		//i = 11
		//j = 4-3
		
		
		
	}

}
