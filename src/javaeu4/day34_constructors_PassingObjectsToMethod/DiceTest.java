package javaeu4.day34_constructors_PassingObjectsToMethod;

public class DiceTest {

	public static void main(String[] args) {


		final int SIX_SIDES = 6;
		final int TWENTY_SIDES = 20;
		
		Dice d = new Dice(SIX_SIDES);
		Dice bb = new Dice(TWENTY_SIDES);
		
		rollDice(d);
		rollDice(bb);

	}
	
	public static void rollDice(Dice d) {
		//rolling a 6 sided dice
		// The dice's value : 5
										//object.methodName	
		System.out.println("Rolling a " + d.getSides() + " sided dice");
		
		System.out.println("The dice's value: " + d.getValue());
		
	}

}
