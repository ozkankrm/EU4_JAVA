package review.week7_String_Manupulation;

public class ExractDate {

	
		/*
		 *   Write a program that will have a String date, which will have format: mm/dd/yyyy. 
		 *   Take the input date and print out the Month name instead of number and the day
		Ex: 
		Input: 10/08/2020
		Output: October 8
		 */
	
	public static void main(String[] args) {
		
		System.out.println(extractMonth("02/10/2010"));
		
	}

	public static String extractMonth(String date) {
		
		String month = date.substring(0, date.indexOf('/'));
		String day = date.substring(date.indexOf('/')+1 , date.lastIndexOf('/'));
		String fixeDate = "";
		
		switch(month) {
		
		case "01":
			fixeDate = "January";
			break;
		case "02":
			fixeDate = "February";
			break;	
		case "03":
			fixeDate = "March";
			break;
		case "04":
			fixeDate = "April";
			break;
		case "05":
			fixeDate = "June";
			break;
		case "06":
			fixeDate = "July";
			break;
		case "07":
			fixeDate = "August";
			break;
			
		}
		
		return fixeDate + " " + day;
		
		
	}


}
