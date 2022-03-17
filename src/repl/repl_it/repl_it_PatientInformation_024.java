package repl.repl_it;

import java.util.Scanner;

public class repl_it_PatientInformation_024 {

	public static void main(String[] args) {
		
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
        int age, zipcode;
        double height, weight;
        boolean isMarried;
        long workPhone, personalPhone;
    
    System.out.println("Welcome to the patient portal!");
    System.out.println("Please enter your personal information");
    
     Scanner scan = new Scanner(System.in);
    
        System.out.println("Enter your first name");
        firstName = scan.nextLine();
        System.out.println("Enter your last name");
        lastName = scan.nextLine();
   // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        
     // continue for city
        System.out.println("Enter your city");
        city = scan.nextLine();
        
        System.out.println("Enter your state");
        state = scan.nextLine();
        
        System.out.println("Enter your zipcode");
        zipcode = scan.nextInt();
        
        System.out.println("Enter your work phone number");
        workPhone = scan.nextLong();
        
        System.out.println("Enter your personal phone number");
        personalPhone = scan.nextLong();
        
        System.out.println("Enter your age");
        age = scan.nextInt();
        
        System.out.println("Enter your height");
        height = scan.nextDouble();
        
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();
        
        
        System.out.println("Full name: " + lastName + ", " + firstName);
        System.out.println("Address: " + street+ ", " + city + ", " +state+ ", "+ zipcode);
        System.out.println("Contacts: work phone number-" + workPhone+ ", "+ "personal phone number-"+personalPhone+ ", " + email);
        System.out.println("Age: " +age);
        System.out.println("Height: " +height);
        System.out.println("Weight: " + weight+ " pounds");
        System.out.println("Married?: " +isMarried);
        
     
     
    
		

	}

}
