package repl.repl_it;

import java.util.Scanner;

public class First1_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		001. Hello, world
		System.out.println("Hello, world");
		
//		002. Hello world2
		System.out.println("Hello, world");
		
//		003. Print name
		System.out.println("Turing, Alan");
		
//		004. Print numbers
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
//		005. 
		
//		006. cool
		System.out.println("I think being a programmer is cool");
		
//		007. Print square
		System.out.println("* * * * * * * *");
		System.out.println("*             *");
		System.out.println("*             *");
		System.out.println("*             *");
		System.out.println("*             *");
		System.out.println("*             *");
		System.out.println("*             *");
		System.out.println("* * * * * * * *");
		
//		008. Print diamond
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("*******");
		System.out.println(" *****");
		System.out.println("  ***");
		System.out.println("   *");
		
//		009.Print Empire State building
		System.out.println("   ^");
		System.out.println("  /|\\");
		System.out.println(" / | \\ ");
		System.out.println("/  |  \\");
		System.out.println("|  |  |");
		System.out.println("|  |  |");
		System.out.println("|  |  |");
		System.out.println("|  |  |");
		System.out.println("|  |  |");
		System.out.println("|  |  |");
		System.out.println("|  |  |");
		System.out.println("|  |  |");
		System.out.println("|  |  |");
		System.out.println("|  |  |");
		System.out.println("|  |  |");
		System.out.println("|  |  |");
		System.out.println("-------");
		
//		10. Print variable1
		String message = "I am a CybertekSchool Student.";
		System.out.println(message);
		
//		11. Print variable2
		int count = 100;
		System.out.println(count);
		
//		12. Scanner intro
		Scanner in = new Scanner(System.in);
		System.out.println("Enter whole number");
		int num = in.nextInt();
		System.out.println(num);
		
		System.out.println("Enter fractional number");
		double cost = in.nextDouble();
		System.out.println(cost);
		System.out.println("You have entered " + cost);
	
//		12. Print variable3
	
		int num1 = in.nextInt();
		double cost1 = in.nextDouble();
		
		System.out.println(num1 +" " + cost1);
	
//		13. Print variable4
		
		System.out.println("Enter the word");
		String word = in.next();
		System.out.println("Today's Word-Of-The-Day is: " + word);
		
//		14 Print variable5
		
		int first = in.nextInt();
		int second = in.nextInt();
		
		System.out.println("first is " + first+ " second = " + second);
		
//		15. Print variable6
		
		int i = in.nextInt();
		float f = in.nextFloat();
		
		System.out.println("i="+i+ " f=" +f);
		
//		16 Print variable7
		
		String p1 = "James";
		String p2 = "Jill";
		String p3 = "Bob";
		String p4 = "Betty";
		String p5 = "Herb";
		System.out.println(p1+ ", "+ p4 + ", "+ p5+ ", "+ p2+ ", "+p3);
		
//		17. Print variable8
		String lan1 = in.next();
		String lan2 = in.next();
		
		System.out.println("I will learn \"" + lan1 +  "\" and \"" + lan2 + "\" at CybertekSchool." );
		
//		18. Primitive 1
		int degreesCelcius;
		
		degreesCelcius = 35;
		System.out.println(degreesCelcius);
		
//		19. Primitive 2
		
		byte steps = 100;
		short miles = 5000;
		int count2 = 1000000;
		long population = 3434455667l;
		
		System.out.println(steps);
		System.out.println(miles);
		System.out.println(count2);
		System.out.println(population);
		
//		20. Time
		int hour, minutes, second1;
		String amOrPm;
		
		hour = in.nextInt();
		minutes = in.nextInt();
		second1 = in.nextInt();
		
		amOrPm = in.next();
		
		System.out.println(hour+":"+minutes+":" +second+" " + amOrPm);
		
		
	}

}
