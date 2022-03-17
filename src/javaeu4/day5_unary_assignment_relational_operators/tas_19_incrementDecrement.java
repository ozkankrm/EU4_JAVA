package javaeu4.day5_unary_assignment_relational_operators;

public class tas_19_incrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 50;

		int result = --a + a++ + a-- + a++;
		System.out.println("a = " + a);
		System.out.println("result = " + result); //49+49+50+49=197

		/*	result;

		a= 50;

		--a; -->49
		a++ -->49
		a-- -->50
		a++ -->49

		total -->197 */


	}

}
