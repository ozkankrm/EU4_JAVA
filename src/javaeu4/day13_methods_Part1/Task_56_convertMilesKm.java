package javaeu4.day13_methods_Part1;

public class Task_56_convertMilesKm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a method that will convert Miles into Kms:
//			convertKM();
		
		convertKm();
		
	}
	public static void convertKm() {
		
		// 1 km = 1.60934
		int  mile=10;
		double km;
		km= mile*1.60934;
		
		System.out.println(mile + " mile = " + km + " km");
	}

}
