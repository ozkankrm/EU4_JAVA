package repl.repl_it;

import java.util.Scanner;

public class repl_it_SchoolGrade_027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String subject1, subject2, subject3, subject4, subject5, summary;
	    double grade1, grade2, grade3, grade4, grade5, average;
	    
	    System.out.println("Welcome to the Grader!");
	    Scanner s = new Scanner (System.in);
	    
	    System.out.println("Please enter subject name number 1 and score for this subject");
	    subject1 = s.next();
	    grade1 = s.nextDouble();
	    
	    System.out.println("Please enter subject name number 2 and score for this subject");
	    subject2 = s.next();
	    grade2 = s.nextDouble();
	    
	    System.out.println("Please enter subject name number 3 and score for this subject");
	    subject3 = s.next();
	    grade3 = s.nextDouble();
	    
	    System.out.println("Please enter subject name number 4 and score for this subject");
	    subject4 = s.next();
	    grade4 = s.nextDouble();
	    
	    System.out.println("Please enter subject name number 5 and score for this subject");
	    subject5 = s.next();
	    grade5 = s.nextDouble();
	    
	    average = (grade1+grade2+grade3+grade4+grade5);
	    
	    System.out.println(subject1 + " - " + grade1+ ", "+ subject2 + " - " + grade2 + ", " + subject3 + " - " + grade3 + ", " + subject4 + " - " + grade4 + ", " +  subject5 + " - " + grade5);
	    
	    
	}

}
