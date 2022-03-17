package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total calories:");
		double totalCalories = scan.nextDouble();
		
		System.out.println("Enter fat grams:");
		double fat = scan.nextDouble();
		
		double fatCalories = fat*9;
		System.out.println(fatCalories);
		double fatCaloriesPercent = (fatCalories/totalCalories)*100;
		System.out.println(fatCaloriesPercent);
		
		if(fatCaloriesPercent<totalCalories*0.3) {
			System.out.println("Low fat");
		}else if(fatCalories>totalCalories) {
			System.out.println("Invalid value");
		}
		
		
	}

}
