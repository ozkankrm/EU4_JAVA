package assignments.day5_assignment_3_aritmetikOperators;

public class Question_6 {

	public static void main(String[] args) {
		/*
* Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of milligrams of caffeine in a drink and 
outputs how many drinks it takes to kill a person.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose
		 */

		
		// 1 gram == 1000 milligrams
		int gram = 10;
		int milligrams =10000;
		int drink;
		
		drink = 10000/milligrams;
		
		System.out.println("Number of milligrams in drink: " + milligrams);
		System.out.println("It would take about " + drink + " for a lethal overdose");
	}

}
