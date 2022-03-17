package review.week4;

import java.util.Iterator;

public class LettersInLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * ABCDEFG
		 * 
		 */

		char c1 = 'A'; // A=65
		++c1; // c1=65+1=66-->B
		System.out.println(c1);
		++c1; // 67-->C
		System.out.println(c1);
		++c1;// 68-->D
		System.out.println(c1);

		--c1;// 67-->C
		System.out.println(c1);

		// if you increment a char variable you will get next character
		// if you decrement a char variable you will get previous character

		for (char letter = 'A'; letter <= 'Z'; letter++) {
			System.out.print(letter + " ");
		}
		System.out.println();

		// print from letter B T�LL G

		for (char let = 'B'; let <= 'G'; let++) {
			System.out.print(let + " ");
		}
		System.out.println();
//		
//		for(char endingChar = 'A'; endingChar<='Z'; endingChar++) {
//			for(char let='A'; let <=endingChar; let++) {
//				System.out.print(let + " ");
//			}
//			System.out.println();
//		}
		System.out.println("*****************************************");

		for (char endingChar = 'Z'; endingChar >= 'A'; endingChar--) {
			for (char let = 'A'; let <= endingChar; let++) {
				System.out.print(let + " ");
			}
			System.out.println();
		}

//		A-->F
		for (char endingChar = 'D'; endingChar >= 'A'; endingChar--) {
			for (char let = 'A'; let <= endingChar; let++) {
				System.out.print(let + " ");
			}
			System.out.println();
		}

		
			
		}
	}


