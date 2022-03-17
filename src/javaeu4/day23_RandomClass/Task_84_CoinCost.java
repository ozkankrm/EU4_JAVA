package javaeu4.day23_RandomClass;

import java.util.Random;

public class Task_84_CoinCost {

	public static void main(String[] args) {
		/*
		 * �Dr. Kimuta was so happy with the dice rolling simulator that you wrote for him, he has
asked you to write one more program. He would like a program that he can use to
simulate ten coin tosses, one after the after. Each time the program simulates a coin
toss, it should randomly display either �Heads� or �Tails�
		 */


		Random rn = new Random();
		
		for(int i=0;i<10;i++) {
			
			if(rn.nextInt(2)==0) {
				System.out.println("Tails");    //Tail=0 Heads=1
			}else {
				System.out.println("Heads");
			}
			
			
			
		}
		
	}

}
