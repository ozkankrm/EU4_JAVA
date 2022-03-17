package review.week3_IfElse_Ternary_ScannerPractice;

public class TernaryPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		anything that ternary operator can do , if esle statment can do it
		
//		String amOrpm = "";
		int hour = 15;
//		
//		if (hour>12) {
//			amOrpm = "AM";
//			
//		}else {
//			amOrpm = "PM";
//		}
		
		
//		syntax ternary 
//		DataType variableName = (condition here ) ? IfTrueAssignThis : IfFalseAssignThis ;  
//		String amOrpm = (hour>12) ? "AM" : "PM" ;
		
//	System.out.println("IT IS " +amOrpm);
	
//	adding less than 24 for condiiton
	
	String ammOrpmm = (hour>12 && hour<24) ? "pmm" : "amm" ;
	
	System.out.println(ammOrpmm);
	
	
	
	int num1 = 10;
	int num2 = 100;
	
	int biggerNumber;
	
	biggerNumber = (num1>num2) ? num1 : num2 ;
	
	System.out.println("Bigger number is " + biggerNumber);
	
	
	
	
	}
	

}
