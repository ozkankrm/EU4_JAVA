package review.week2_OperatorCondition;

public class LogicalOperatorsPractice {

	public static void main(String[] args) {
		// If we have more than one condition using logical operators
		
		// LOGICAL AND &&
		//LOGICAL OR  ||
		// exclusive or ^
		
		boolean light1On = true;
		boolean light2On = false;
		// check both true or not
		System.out.println(  light1On && light2On    );
		
		// check one of them true or not
		System.out.println(  light1On || light2On    );
		
		//check if exactly one light is off and anotheer is on
		System.out.println(  light1On ^ light2On    );
	
		// if the both light are on print all on
		// else print not both lights are one
		
		//
		if( light1On && light2On) {
			System.out.println("BOTH LIGHTS ARE ON");
		}else {
			System.out.println("NOT BOTH LIGHTS ARE ON");
		
		
		// How many condition we can combine ?--> as many as you want
		
		// check if at least one light is on
			if( light1On || light2On) {
				System.out.println("AT LEAST ONE LIGHT IS ON");
			}else {
				System.out.println("NONE OF THE LIGHTS ARE ON !! DARK !!");
			}
				// CHECK EXACTLY ONE LIGHTS ONE ONE LIGHTS IS OFF!!
				if( light1On ^ light2On) {
					System.out.println("eaxctly ....... ");
				}else {
					System.out.println("either both lights are on or of");	
		}
	
	}

		}
	}
