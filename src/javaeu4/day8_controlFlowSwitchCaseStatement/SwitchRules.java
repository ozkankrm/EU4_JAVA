package javaeu4.day8_controlFlowSwitchCaseStatement;

public class SwitchRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	final	String lastName = "Smith";
		String firstName = "Mike";
		int id = 0;
		
		switch(firstName) {
		case "Test":
			System.out.println("Test");
			break;
		case lastName:
			id = 5;
			break;
			
		}
		
		if(true) //e�er bir ko�ul varsa curly braces kullanmayabilirsin
			System.out.println("What are you doing");
		else
			System.out.println("wooow");
		
		
		if(false)
			System.out.println("hello"); // buras� if e ba�l�d�r ve if true ise �al���r yoksa �al��maz
		    System.out.println("yes"); // buras� if e ba�l� de�ildir
	}

}
