package assignments.Assignmet_9;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

		 Scanner scan=new Scanner(System.in);
			
			System.out.println("Split:");
			String split=scan.next();
		
			
			System.out.println("Number of people:");
			int numberOfPeople=scan.nextInt();
			
			System.out.println("Check amount:");
			double amount=scan.nextDouble();
			
			System.out.println("Service Quality:");
			String serviceQuality=scan.next();
			
			double totalTip=0;
			double totalPay=0;
			double totalPerPerson=0;
			double tipPerPerson=0;
			
			
			// WRITE YOUR CODE HERE
			
		if ( split.equals("Yes")){
			  
			  if (serviceQuality.equals("Poor")){
			    totalTip = amount*0.05;
			    
			   }else if (serviceQuality.equals("Fair") ){
			    totalTip = amount*0.1;
			    
			   }else if (serviceQuality.equals("Good") ){
			    totalTip = amount*0.15;
			  
		  	 }else if (serviceQuality.equals("Great") ){
			    totalTip = amount*0.20;
			
		  	}else if (serviceQuality.equals("Excellent") ){
			    totalTip = amount*0.25;
			    
		  	}  
		  
			  System.out.print("Number of people entered: " );
			  for(int i = 1; i<=numberOfPeople; i++) {
				System.out.print("&");  
			  }
			  System.out.println();
			  
			  
			  totalPay = totalTip  + amount;
			  System.out.println("Total to pay: " + totalPay);
			  System.out.println("Total tip: " + totalTip);
		
			  System.out.println("Total per person: " + totalPay/numberOfPeople);
		  
			  System.out.println("Tip per person: " + totalTip/numberOfPeople);
			  
		}
			
		
	}

}
