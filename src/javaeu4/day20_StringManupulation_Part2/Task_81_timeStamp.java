package javaeu4.day20_StringManupulation_Part2;

public class Task_81_timeStamp {

	public static void main(String[] args) {
		
//		Write a method that accept the date with time and creates a timeStamp for your automation
//		report.
		
//		real work environment
		
		String time = "10/10/2019 14:59:00";
		
//		test sonucunu raaport ederken tarih ve saat a�a��daki gibi olur ve java bunu kabul eder
		System.out.println(timeStamp(time));//10102019145900

	}
	
	public static String timeStamp(String time) {
			
			time = time.replace("/", "").replace(" ", "").replace(":", "");
			
//			test sonucunu raaport ederken tarih ve saat a�a��daki gibi olur ve java bunu kabul eder
		return time;
			
	}

}
