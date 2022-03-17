package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an object's mass");
		double mass = scan.nextDouble();
		
		double weight = mass*9.8;
//		System.out.println(weight);
		
		if(weight<10) {
			System.out.println("That the object is too light");
		}else if(weight>1000) {
			System.out.println("That the object is too heavy");
		}
	}

}
