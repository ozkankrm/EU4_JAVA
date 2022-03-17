package javaeu4.day8_controlFlowStatement_Part2;

public class nestedIFstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isRushHour = true;
		int carType = 2;
		double price =1.6;
		
		if (carType==1) {
			if(isRushHour) {
				price=30.0;
			}else {
				price = 5.0;
			}
		}else if(carType==2) {
			if(isRushHour) {
				price=55.30;
			}else {
				price =15.99;
			}
		}
		System.out.println("Toll Cost: " + price);
		
	}

}
