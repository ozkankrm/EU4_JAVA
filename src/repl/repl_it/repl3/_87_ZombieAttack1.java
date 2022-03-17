package repl.repl_it.repl3;

import java.util.Scanner;

public class _87_ZombieAttack1 {

	public static void main(String[] args) {
		/*
		 * A variable inhabitants represents a city and its respective populations. 
		 * City might have a population of 0 due to a pandemic zombie disease that is wiping away
		 *  the human lives. After each day, a city will lose half of its population.
		 *  write a program to loop the city population and make it lose half of its population 
		 *  until no humans left. Print the each day like below for each day:

example1- inhabitants is 6

Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----

example2- inhabitants is 0
---- EXTINCT ----

example3- inhabitants is 20
Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ----
		 */
		
		Scanner scan = new Scanner(System.in);
//	    int inhabitants = scan.nextInt();
	    
	    System.out.println("Enter your name");
	    String str = scan.nextLine();
	    
	    System.out.println("You enter " + str);
	    
	    int i = scan.nextInt();
	    scan.nextLine();
	    
	    String s = scan.nextLine();
	    
	    
	    
	    // keep dividing a number by until its 0
	    // 5/2 = 2, 2/2=1, 1/2=0
	    
	/*    int day = 0;
	    while(inhabitants>0) {
	    // 10/2=5
	    
	    System.out.println("Day " + day + " [" + inhabitants + "]");
	    inhabitants = inhabitants/2;
	 //   System.out.print(inhabitants);
	    day++;
	
	}
	System.out.println("---- EXTINCT ----"); */
	}
}
