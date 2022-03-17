package assignments.day5_assignment_3_aritmetikOperators;

public class Question_7 {

	public static void main(String[] args) {
		/*
		 * Write a program that determines the change to be dispensed from a vending machine.
		 *  An item in the machine can cost between 25 cents and 1 dollar, 
		 *  in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
		 *  and the machine accepts only a single dollar bill to pay for the item.

      Sample output

      Price in cents : 95

      Your change is 0 quarters, 0 dimes, and 1 nickles
		 */
		
		int quarters, dimes,nickles,change;
		int price = 65;
	final	int accept = 100;
		change = accept-price;
		
		quarters = change / 25;
		dimes = (change - (quarters*25)) / 10;
		nickles = change % 10;
		
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " +nickles+ " nickles");
		
		
				
		
		
		
	}

}
