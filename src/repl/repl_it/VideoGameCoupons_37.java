package repl.repl_it;

import java.util.Scanner;

public class VideoGameCoupons_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
		    int numberOfCoupons, candies, gumballs;
		    
		    System.out.println("Enter number of coupons:");
		    numberOfCoupons = scan.nextInt();
		    candies = numberOfCoupons/10;
		  int  remainCouponsAfterCandies= numberOfCoupons-(candies*10);
		    gumballs = remainCouponsAfterCandies/3;
		    
		    if(numberOfCoupons>=3){
		    System.out.println("Number of Candies: "+ candies);
		    System.out.println("Number of Gumballs: "+ gumballs);
		    }else{
		      System.out.println("Not enough coupons");
		    }

	}

}
