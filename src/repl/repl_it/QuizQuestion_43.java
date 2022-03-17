package repl.repl_it;

import java.util.Scanner;

public class QuizQuestion_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
		    
		    System.out.println("what is the farthest planet in the solar system:" );
		    System.out.println("a)venus" );
		    System.out.println("b)pluto" );
		    System.out.println("c)neptune" );
		    
		    String a = s.nextLine();
////		    System.out.println(a + " is wrong");
//		    
//		    String b = s.nextLine();
////		    System.out.println(b + " is correct");
//		    
//		    String c = s.nextLine();
////		    System.out.println(c + " is wrong");
//		    
////		    String z = s.nextLine();
////		    System.out.println(z + " is not valid answer");
//		    
//		    if ( a.equals(a)) {
//		    	System.out.println(a + " is wrong");
//		    }else if ( a.equals(b)) {
//		    	System.out.println(b + " is correct");
//		    }else if(a.equals(c)) {
//		    	System.out.println(c + " is wrong");
//		    }else {
//		    	 System.out.println(a + " is not valid answer");
//		    }
//		    
		    switch(a) {
		    
		    case "a":
		    	System.out.println("a is wrong");
		    	break;
		    case "b":
		    	System.out.println("b is correct");
		    	break;
		    case "c":
		    	System.out.println("c is wrong");
		    	break;
		    	default:
		    		System.out.println(a+" is not a valid answer");
		    		break;
		    }
	}

}
