package assignments.day12_Assignment_5_MixLoop;


public class Question_6 {

	public static void main(String[] args) {
//		Write a program to print Fibonacci series of n terms where n is declared by user :
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		

//		0 1 1 2 3 5 8 13 21 34 
//	    a b c
//		  a b c
//		    a b c
		
		
		int a = 0;
		int b = 1;
		int c;
		
			for(int i = 0; i<10; i++) {
				
			System.out.println(b+ " ");
			
			c = a+b;
			a=b;
			b=c;
			
		}
		
	}

}
