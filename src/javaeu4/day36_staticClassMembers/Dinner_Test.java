package javaeu4.day36_staticClassMembers;

public class Dinner_Test {

	public static void main(String[] args) {


		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();

		
		
		System.out.println("Total slices: " + Dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		//dad.pizzaSlice == Dinner.pizzaSlice
		System.out.println("Total slices: " + Dinner.pizzaSlice);
		
		kid.takeASlice(3);
		dad.takeASlice(2);
		
		System.out.println(Dinner.pizzaSlice);
		
	}

}
