package repl.repl_it.repl3;

import java.util.Scanner;

public class _157_Methods12_TimeConversion {

	public static void main(String[] args) {
		/*
		 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45

		 */
		/*
		
		Input: 07:05:45PM
		Output: 07:05:45
		
		Input: 12:00:00AM
		Output: 12:00:00
		
		Input: 12:00:00PM
		Output: 12:00:00
		 * 
		 */

		 Scanner scan = new Scanner(System.in);
		    timeConversion(scan.nextLine());
	}
	 public static void timeConversion(String s) {
		    /*
				 * Write your code here.
				 */
		//int hour = 
		 if(s.equals("12:00:00AM")) {
			 System.out.println("12:00:00");
		 }else if(s.equals("12:00:00PM")) {
			 System.out.println("12:00:00");
		 }else if(s.endsWith("AM")) {
			 System.out.println(s.replace("AM", ""));
		 }else if(s.endsWith("PM")) {
			 //Input: 07:05:45PM
			 //Output: 19:05:45
			 
			 int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
			 hour +=12;
			 String newTime = hour + s.substring(s.indexOf(":")).replace("PM", "");
			 System.out.println(newTime);
		 }		 
		  }

}
