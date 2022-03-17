package repl.repl_it;

import java.util.Scanner;

public class BuildRoute_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that will print out route instructions. 
		 * Your program should take 2 parameters: start point and endpoint. 
		 * Use left, right, up and down for navigation.
		 *  Insert ">" between commands. If start point equals to 
		 *  endpoint - display: "start/end(start or end variable!) found".
            Note: you may move only clockwise.
		 */
		
		 Scanner scan = new Scanner(System.in);
		 
		 	System.out.println("Enter a start point");
		    String start = scan.next();
		    
		    System.out.println("Enter an end point");
		    String end = scan.nextLine();
		   
		    
		    
		   if(start.equals("B") && end.equals("C")){
		     System.out.println("down: " + end + " found");
		     
		   }else if(start.equals("B") && end.equals("D")){
		     System.out.println("down > left: " + end + " found");
		     
		   }else if(start.equals("B") && end.equals("A")){
		     System.out.println("down > left > up: " + end + " found");
		     
		   }else if(start.equals("B") && end.equals("B")){
		     System.out.println( end + " found"); 
		     
		  }else if(start.equals("C") && end.equals("D")){
		     System.out.println("left: " + end + " found");
		     
		 }else if(start.equals("C") && end.equals("A")){
		     System.out.println("left > up: " + end + " found");
		       
		    }else if(start.equals("C") && end.equals("B")){
		     System.out.println("left > up > right: " + end + " found");
		       
		     }else if(start.equals("C") && end.equals("C")){
		     System.out.println(end + " found");
		       
		     }else if(start.equals("D") && end.equals("A")){
		     System.out.println("up: " + end + " found");
		     
		    }else if(start.equals("D") && end.equals("B")){
		     System.out.println("up > right: " + end + " found");
		     
		    }else if(start.equals("D") && end.equals("C")){
		     System.out.println("up > right > down: " + end + " found"); 
		    
		    }else if(start.equals("D") && end.equals("D")){
		     System.out.println(end + " found");
		    
		    }else if (start.equals("A") && end.equals("B")){
		     System.out.println("right: " + end + " found"); 
		    
		    }else if(start.equals("A") && end.equals("C")){
		     System.out.println("right > down: " + end + " found"); 
		     
		    }else if(start.equals("A") && end.equals("D")){
		     System.out.println("right > down > left: " + end + " found"); 
		     
		    }else if(start.equals("A") && end.equals("A")){
		     System.out.println(end + " found");
		     
		    }
}
}