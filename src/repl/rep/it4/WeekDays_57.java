package repl.rep.it4;

import java.util.Scanner;

public class WeekDays_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter number:");
		   int num = scan.nextInt() ;
		   
		   days(num);
		    
		  }
		  
		  public static void days(int num){
		    
		    String result = "";
		    switch(num){
		      case 1:
		      result = "Monday";
		      break;
		      case 2:
		      result = "Tuesday";
		      break;
		      case 3:
		      result = "Wednesday";
		      break;
		      case 4:
		      result = "Thursday";
		      break;
		      case 5:
		      result = "Friday";
		      break;
		      case 6:
		      result = "Saturday";
		      break;
		      case 7:
		      result = "Sunday";
		      break;
		      
		      
		    }
		    
		  System.out.println(result);
		  }
	}


