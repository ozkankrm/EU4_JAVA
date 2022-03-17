package javaeu4.day5_unary_assignment_relational_operators;

public class task_20_increDecre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =1;
		int result = -a-- + a++ / -a-- * --a;
		// a in mem 1: 
		//result: -1 + 0 / -1 * -1 = -1 + 0= -1 
		
		System.out.println(" a = " + a);
		System.out.println("result = " + result);
	}

}
