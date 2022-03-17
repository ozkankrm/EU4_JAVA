package repl.repl_it.repl3;

import java.util.Scanner;

public class ParseJSONfile_104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
			String json = scan.nextLine();
			
		int firstNameIndex = json.indexOf("firstName");
		int lastNameIndex = json.indexOf("lastName");
		
		int commo1  = json.indexOf(",", firstNameIndex);
		int commo2 = json.indexOf(",", lastNameIndex);
		
		json.substring(lastNameIndex+12, json.indexOf(",", lastNameIndex)); 
		System.out.println("First name: " + json.substring(firstNameIndex+13, commo1-1));
		System.out.println("Last name: " + json.substring(lastNameIndex+12, commo2-1));
	}

}
