package repl.repl_it;

public class SimplePrintPatern_150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
//			
//			hint:you will need to use two nested for loops for that, 
//			and an if that checks if its the last or first iteration of the loop 
//			(so you will know whet to print "*" or " ")
		
	
		printHollowRect();
		
	}

	public static void printHollowRect() {
		
		for(int i=1; i<=5; i++) {
			
			if(i==1) {
				for(int j=1; j<=5; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		for(int i=1; i<=3; i++) {
			System.out.print("*");
			for(int k=1; k<=3; k++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for(int j=1; j<=5; j++) {
			System.out.print("*");
		}
	}
}
