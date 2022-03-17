package javaeu4.day4_aritmeticOperators;

public class aritmeticOperators {

	public static void main(String[] args) {
		// Additional Operator +
		
		System.out.println(55+5);
		
		int chairs = 140;
		System.out.println(chairs+2);
		
		int moreChairs =chairs+5;
		System.out.println(moreChairs);
		
		int tables =130;
		int total = tables+chairs;
		System.out.println(total);
		
		// Subtrction  -
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance-transaction);
		balance = balance-transaction;
		System.out.println(balance);
		
		int ln = 50;
		System.out.println("L�ne of code " + ln);
		ln = ln-2;
		System.out.println("L�ne of code " + ln);
	
		ln = 48+2;
		System.out.println(ln);
		
		// Multiplication *
		
		System.out.println(22*3);
		int cl = 5;
		System.out.println(ln*cl);
		int totalln = ln*5;
		System.out.println("Total lines of code = " + totalln);
		
		// Division  /
		System.out.println(60/2);
		
		//System.out.println(15/0); //throw error while running code
		
		// remainde %
		System.out.println(10%2); // 0
		
		

	}

}
