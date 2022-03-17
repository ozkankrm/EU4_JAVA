package javaeu4.day7_controlFlowStatement;

public class task_28_revenueCalculate {

	public static void main(String[] args) {
/*
* Revenue can be calculated as the selling price of the product times the quantity sold, i.e.
revenue = price � quantity.Write a program that asks the user to enter product price and
quantity and then calculate the revenue. If the revenue is more than 5000 a discount is
10% offered. Program should display the discount and net revenue.
		 */

		double revenue ;
		double produckPrice = 100 ;
		int  quantity = 51;
		
		double discount=0;
		double newRevinue;
		revenue = produckPrice*quantity;
		
		if(revenue>5000) {
			//discount0.1
			discount =revenue*0.1;
			revenue = revenue-discount;
			
			
		}
		System.out.println("discount = " +  discount);
		System.out.println("revenue  = " + revenue );
		
	}

}
