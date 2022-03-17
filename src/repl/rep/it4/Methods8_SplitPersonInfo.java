package repl.rep.it4;

import java.util.Scanner;

public class Methods8_SplitPersonInfo {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		    
		  }
		  
		   public static void person(String info) 
			{
			
			int firstComma = info.indexOf(",");
			int secondComma = info.indexOf(",", firstComma+1);
			
			String name = info.substring(0, firstComma );
			String lastName = info.substring(firstComma+1, secondComma);
			String age = info.substring(secondComma+1);
			
			System.out.println("person name: " + name + " last name: " + lastName + " age: " + age);
				
			
			}//end person
		  

}
