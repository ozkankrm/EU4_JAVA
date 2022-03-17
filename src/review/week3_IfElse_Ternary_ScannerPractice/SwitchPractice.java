package review.week3_IfElse_Ternary_ScannerPractice;

public class SwitchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int seasonCode = 5; // 1,2,3,4
		// 1 : Spring  : Summer 3: Fall 4: Winter
		
		switch(seasonCode) {
		case 1: 
			System.out.println("Spring");
			break;// this is or breaking out of the switch statement
		case 2:
			System.out.println("Summer");
			break;
		case 3:
			System.out.println("Fall");
			break;
		case 4:
			System.out.println("Winter");
			break;
		default:
			System.out.println("INVALID ENTRY!!!!");
			break;// this is optianol herr because this is the last line of switch anyway
		}
		
		
		/*
		if(seasonCode==1) {
			System.out.println("Spring");
		}else if(seasonCode==2) {
			System.out.println("Summer");
			
		}else if(seasonCode==3) {
			System.out.println("Fall");
		}else if(seasonCode==4) {
			System.out.println("Winter");
		}else {
			System.out.println("INVALID ENTRY!!!!");
		}
		*/
	}

}
