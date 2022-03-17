package javaeu4.day2_printing_comments;

public class triangle {
	
	public static void main(String[] args) {
		
		System.out.println("    *    ");
		System.out.println("   * *   ");
		System.out.println("  *   *  ");
		System.out.println(" *     * ");
		System.out.println("*********");
	
		for(int i=1; i<=5; i++) {
			for (int k=1; k<=i; k++) {
				System.out.print(" ");
				System.out.print("*");
			
				
		}
		System.out.println();
	}

		
}
}