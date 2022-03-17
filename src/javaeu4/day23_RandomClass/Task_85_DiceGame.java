package javaeu4.day23_RandomClass;

import java.util.Random;

public class Task_85_DiceGame {

	public static void main(String[] args) {
		/*
		 * Write a program that plays a simple dice game between the computer and the
user. When the program runs, a loop should repeat 10 times. Each iteration of the
loop should do the following:
�Generate a random integer in the range of 1 thru 6. This is the value of the
computer�s dice.
�Generate another random integer in the range of 1 thru 6. This is the value
of the user�s dice.
�The dice with the highest value wins. (In case of a tie, there is no winner)
As the loop iterates , the program should keep count of the number of times the
computer wins, and the number of times that the user wins. After the loop
performs all of its iterations, the program should display who was the grand
winner, the computer or the user.
		 */

		Random rn = new Random();
		int computerDice;
		int userDice;
		int computerPoints=0;
		int userPoints=0;
		
		for(int i=0;i<10;i++) {
			
			computerDice = rn.nextInt(6)+1;
			userDice = rn.nextInt(6)+1;
			
			if(computerDice>userDice) {
				computerPoints++;
			}else if(userDice>computerDice) {
				userPoints++;
			}
		}
		
		System.out.println("Computer point is:" + computerPoints);
		System.out.println("User point is:" + userPoints);
		
		if(computerPoints>userPoints) {
			System.out.println("Computer wins");
		}else if(userPoints>computerPoints) {
			System.out.println("User wins");
		}else {
			System.out.println("There is no winner");
		}

	}

}
